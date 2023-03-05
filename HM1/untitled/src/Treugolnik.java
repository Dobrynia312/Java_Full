import java.util.Scanner;
public class Treugolnik {
    public static int Treugolnik(int number){
        int x = (number*(number+1))/2;
        return x;
    }
    public static int GetValue(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int value = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        return value;
    }
    public static void main(String[] args) {
        int number = GetValue();
        int result = Treugolnik(number);
        System.out.printf("Треугольное число %d это %d", number, result);

    }
}