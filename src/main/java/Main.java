import org.apache.log4j.Logger;

public class Main {

    private final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args){
        logger.info("Program started");
        logger.info("Method main");
        m();
        logger.info("Program stopped");

    }

    private static void m(){
        logger.info("Method m");
    }
}
