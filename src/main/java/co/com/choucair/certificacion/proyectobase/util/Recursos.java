package co.com.choucair.certificacion.proyectobase.util;


public class Recursos {
	
	public static void pausa(int segundos) {
		try {
			Thread.sleep(segundos* 1000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
