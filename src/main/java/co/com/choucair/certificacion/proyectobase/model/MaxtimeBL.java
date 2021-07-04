package co.com.choucair.certificacion.proyectobase.model;

import co.com.choucair.certificacion.proyectobase.exceptions.BackEndExceptions;
import cucumber.api.DataTable;

public class MaxtimeBL {
    Maxtime objMaxtime = new Maxtime();

    public Maxtime cargarDatos(DataTable dtDatos) {
        try {
            objMaxtime.setProyecto(dtDatos.asList(String.class).get(0));
            objMaxtime.setServicio(dtDatos.asList(String.class).get(1));
            objMaxtime.setActividad(dtDatos.asList(String.class).get(2));
            objMaxtime.setHoras(dtDatos.asList(String.class).get(3));
            objMaxtime.setComentario(dtDatos.asList(String.class).get(4));

        } catch (Exception e) {
            throw new BackEndExceptions(e);
        }
        return objMaxtime;
    }
}
