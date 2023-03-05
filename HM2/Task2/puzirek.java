import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class puzirek {
    public static void logger(int[] arr) {
        Logger logger = Logger.getLogger(puzirek.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        logger.setLevel(Level.INFO, arr);
    }

    public static void main(String[] args) {
        int[] array = new int {
            23, 42, 18, 5, 2, 1
        } ;
        logger(array);
    }
}