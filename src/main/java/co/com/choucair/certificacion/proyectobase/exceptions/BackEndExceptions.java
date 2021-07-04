package co.com.choucair.certificacion.proyectobase.exceptions;

//
// Clase de exceptions personalziadas de tipo RunTime
//
// @author Oscar Armando Vallejo Tovar
//
public class BackEndExceptions extends RuntimeException {

    /**
     * Instantiates a new Back end exceptions.
     */
    public BackEndExceptions() {
        super();
    }

    /**
     * Instantiates a new Back end exceptions.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public BackEndExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Instantiates a new Back end exceptions.
     *
     * @param message the message
     * @param cause   the cause
     */
    public BackEndExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Back end exceptions.
     *
     * @param message the message
     */
    public BackEndExceptions(String message) {
        super(message);
    }

    /**
     * Instantiates a new Back end exceptions.
     *
     * @param cause the cause
     */
    public BackEndExceptions(Throwable cause) {
        super(cause);
    }


}
