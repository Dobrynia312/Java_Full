import java.util.Scanner;
public class vziatie_dannih {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);//exempliar class scaner
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("int age: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int age = iScanner.nextInt();
        System.out.printf("Hi, %s your age is %s!",name,age);
        iScanner.close();
    }
}