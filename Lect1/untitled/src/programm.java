public class programm {//nazvanie sootvetstvuet failu
    public static void main(String[] args) {//tochka vhoda, obiazatel'no doljen bit' main
       /* System.out.println("bye world");*//*sout*//*
        String s = null;//null - nichego ili pustaia stroka
        int x = 2; // -2mlrd -> 2mlrd 4byte
        short age = 10;
        float a = 2.7f;//f pokazivaet chto chislo eto float
        double pi = 3.1415D;//D ne obiazatelen 8byte
        char ch = 'c'; //
        double y = x; // neavnoe preoprazovanie rabotaet iz-za razmera pamiati
        boolean flag1 = 123 <= 312;//true
        boolean f = true && false; //&& - log operacii & - pobitovaia operacia
        */
        /*String mag = "Hello";
        System.out.println(mag);*/
        int i = 132_321;//neiavnaia tipizacia
        System.out.println(getType(i));
        System.out.println(Integer.MAX_VALUE);
        //. obrashenie k classu ili primitivu
        String s = "ewer";
        char x = s.charAt(1);

    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}