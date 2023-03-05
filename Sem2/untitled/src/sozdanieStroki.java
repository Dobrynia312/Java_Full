/*Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N,
 которая состоит из чередующихся символов c1 и c2, начиная с c1.*/


public class sozdanieStroki {
    private static String GetString(int num, char c1, char c2){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num/2; i++) {
             sb.append(c1).append(c2);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int N = 4;
        char c1 = 's';
        char c2 = 'v';
        String sb = GetString(N,c1,c2);
        System.out.println(sb);

    }
}