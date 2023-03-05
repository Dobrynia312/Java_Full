/*Напишите метод, который сжимает строку.*/
/*Напишите метод, который принимает на вход строку
(String) и определяет является ли строка палиндромом (возвращает boolean значение).*/


public class sjatiestroki {
    public static void main(String[] args) {
        String ex = "aaaabbbcdd";
        ex += " ";
        char[] ex_temp = ex.toCharArray();
        char[] count = GetCount(ex_temp).toCharArray();
        char[] sb = GetChar(ex_temp).toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            res.append(count[i]).append(sb[i]);
        }
        System.out.println(res.toString());
        }

    public static String GetCount(char[] arr) {
        int count = 1;
        StringBuilder arr3 = new StringBuilder();
        for (int i = 1; i < (arr.length); i++) {
            char c1 = arr[i];
            char c2 = arr[i - 1];
            if (c1 == c2) {
                count += 1;
            }
            else {arr3.append(count);
            count = 1;}
    }
        return arr3.toString();
}
    public static String GetChar(char[] arr){
    StringBuilder arr3 = new StringBuilder();
    for (int i = 0; i < arr.length-1; i++) {
        char c1 = arr[i];
        char c2 = arr[i + 1];
        if (c1 != c2) {
            arr3.append(c1);
        }

    }
    return arr3.toString();
}
}

