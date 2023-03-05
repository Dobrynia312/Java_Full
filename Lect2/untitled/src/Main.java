public class Main {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }

        /*StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }*/
        System.out.println(System.currentTimeMillis()-s);
    }
}