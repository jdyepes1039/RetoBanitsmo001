package co.com.choucair.certificacion.proyectobase.questions;

import co.com.choucair.certificacion.proyectobase.userinterface.ValideDocumentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answers implements Question <Boolean>{
    private String question;

    public Answers(String question) {
        this.question = question;
    }

    public static Answers toThe(String question) {
        return new Answers(question);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String nameDocument = Text.of(ValideDocumentPage.FATCA_CRS_PDF).viewedBy(actor).asString();
        if(question.equals(nameDocument)){
            result = true;
        }else {
            result=false;
        }
        return result;
    }
}
