package javax.visrec.util;

/**
 * The Builder is able to attempt to invoke setter methods of the implemented Builder interface. If the
 * declared setter method can't be invoked it will throw this exception because the configuration
 * doesn't match the method to invoke.
 *
 * @author Kevin Berendsen
 */
public class InvalidBuilderConfigurationException extends RuntimeException {

    InvalidBuilderConfigurationException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

}
