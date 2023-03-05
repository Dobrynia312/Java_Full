import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class stepen {
    public static void main(String[] args) {
        int k = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        System.out.println(k);
        int xk = k;
        int[] step = new int[k + 1];
        for (int j = 0; j < step.length; j++) {
            step[j] = xk;
            xk--;
        }
        for (int item2 : step
        ) {
            System.out.printf("%d ", item2);
        }
        System.out.println();
        Random random = new Random();
        int[] arg = new int[k + 1];
        for (int i = 0; i < arg.length; i++) {
            arg[i] = random.nextInt(100);
        }

        for (int item : arg
        ) {
            System.out.printf("%d ", item);
        }
        String[] arr2 = new String[k + 1];
        for (int i = 0; i < arr2.length; i++) {
            if (step[i] != 1 && step[i] != 0) {
                arr2[i] = arg[i] + "x^" + step[i];
            } else if (step[i] == 1) {
                arr2[i] = arg[i] + "x";
            } else if (step[i] == 0) {
                arr2[i] = String.format("%d", arg[i]);
            }
        }
        System.out.println();
        String res = String.join("+", arr2) + "=0";
        System.out.println(res);

        try (FileWriter fw = new FileWriter("file2.txt", false)) {
            fw.write(res);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
