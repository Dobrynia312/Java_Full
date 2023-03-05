// дан массив чисел, нужно сформировать новую выборку
// только из четных чисел
import java.util.Scanner;
import java.util.Random;
public class Main {
    static void massivRand(){
        Random random = new Random();
        int k = random.nextInt(1, 10 + 1);
        System.out.println("Длинна массива " + k);
        int[] arr = new int[k];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i]%2==0){
                count +=1;
            }
        }
        for (int item: arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        int[] new_arr = new int [count];
        int x =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                new_arr[x] = arr[i];
                x +=1;
            }
        }
        for (int item2: new_arr) {
            System.out.printf("%d ", item2);
        }
    }
    static void massivFromPolz(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите длинну массива: ");
        int z = Integer.parseInt(iScanner.nextLine());
        int[] arr = new int [z];
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Введите элемент массива: ");
            arr[i] = Integer.parseInt(iScanner.nextLine());
            if (arr[i]%2==0){
                count+=1;
            }
        }
        iScanner.close();
        int[] new_arr = new int [count];
        int x =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                new_arr[x] = arr[i];
                x +=1;
            }
        }
        for (int item2: new_arr) {
            System.out.printf("%d ", item2);
        }

    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Что хотите сделать:\n" +
                "1 - вручную ввести\n" +
                "2 - рандомом сделать");
        int z = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        if (z == 1) {
            massivFromPolz();
        }
        else{
            massivRand();
        }

    }
}
