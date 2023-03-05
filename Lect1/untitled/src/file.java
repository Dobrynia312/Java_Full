import java.io.*;
public class file {
    public static void main(String[] args) throws IOException {
/*try (FileWriter fw = new FileWriter("file.txt",false)){
    fw.write("line1");
    fw.append('\n');
    fw.append('2');
    fw.append('\n');
    fw.write("line2");
    fw.flush();
}catch (IOException ex){
    System.out.println(ex.getMessage());
}*/
     /*   FileReader fr = new FileReader("file.txt");
        int c;
        while((c= fr.read()) != -1){
            char ch = (char) c;
            if (ch == '\n'){
                System.out.println(ch);
            }else {
                System.out.println(ch);
            }
        }*/
       /* BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while((str = br.readLine())!=null){
            System.out.printf("== %s ==",str);
        }
        br.close();*/
        
    }
}