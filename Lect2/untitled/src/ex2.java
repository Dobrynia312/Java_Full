public class ex2 {
    public static void main(String[] args) {
        String[] name = {"М", "а", "к", "с", "и", "м"};
        String mx = "Максим Доб. ";
        System.out.println(mx.toLowerCase());
        System.out.println(String.join("", name));
        System.out.println(String.join("", "М", "а", "к", "с", "и", "м"));
        System.out.println(String.join(",","М", "а", "к", "с", "и", "м"));
    }
}