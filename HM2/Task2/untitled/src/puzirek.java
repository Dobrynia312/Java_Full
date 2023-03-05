import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class puzirek {
    public static Logger logger = Logger.getLogger(puzirek.class.getName());

    public static int[] sortPuz(int[] arr) throws IOException {
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            logger.info(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        int[] array = {23, 42, 18, 5, 2, 1};
        logger.info(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        sortPuz(array);
    }
}