public class funtion_method {
    static void sayHi(){
        System.out.println("hi");
    }
    static int sum(int a, int b){
        return a+b;
    }
    static double factorial(int n){
        if (n==1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        sayHi();
        System.out.println(sum(1,2));
        System.out.println(factorial(5));
    }
}