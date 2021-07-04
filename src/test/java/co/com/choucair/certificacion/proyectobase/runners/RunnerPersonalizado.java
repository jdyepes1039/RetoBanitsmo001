package co.com.choucair.certificacion.proyectobase.runners;


import co.com.choucair.certificacion.proyectobase.exceptions.BackEndExceptions;
import co.com.choucair.certificacion.proyectobase.util.BeforeSuite;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class RunnerPersonalizado extends Runner {

	private Class<CucumberWithSerenity> classValue;
	private CucumberWithSerenity cucumberWithSerenity;

	public RunnerPersonalizado(Class<CucumberWithSerenity> classValue) {

		try {

			this.classValue = classValue;
			cucumberWithSerenity = new CucumberWithSerenity(classValue);
		} catch (Exception e) {
			throw new BackEndExceptions(e);
		}
	}

	@Override
	public Description getDescription() {
		return cucumberWithSerenity.getDescription();
	}

	private void runAnnotatedMethods(Class<?> annotation) {

		try {

			if (!annotation.isAnnotation()) {
				return;
			}
			Method[] methods = this.classValue.getMethods();
			for (Method method : methods) {
				Annotation[] annotations = method.getAnnotations();
				for (Annotation item : annotations) {
					if (item.annotationType().equals(annotation)) {
						method.invoke(null);
						break;
					}
				}
			}
		} catch (Exception e) {
			throw new BackEndExceptions(e);
		}
	}

	@Override
	public void run(RunNotifier notifier) {
		try {
			runAnnotatedMethods(BeforeSuite.class);
			cucumberWithSerenity = new CucumberWithSerenity(classValue);
		} catch (Exception e) {
			throw new BackEndExceptions(e);
		}
		cucumberWithSerenity.run(notifier);
	}
}
