import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task5 {
   public static int Getcount(File [] arr){
        int count = 0;
        for (File file : arr) {
            if (file.isFile()) {
                count+=1;
            }
        }
        return count;
    }
    public static String[] GetStringMass(int count, File[] arr){
        String[] Res = new String[count];
        for (int i = 0; i < count; i++) {
            Res[i] =arr[i].getName();
        }
        return Res;
    }
    public static void WriteToFile(String name, String[] mass) throws IOException {
        FileWriter writer = new FileWriter(name);
        for(String str: mass) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
    }
    public static void main(String[] args) throws IOException {
        File folder = new File("D:\\WAR\\Manyunya.S02.2022.WEBRip.1080p");
        File[] listOfFiles = folder.listFiles();
        String[] Res = GetStringMass(Getcount(listOfFiles), listOfFiles);
        WriteToFile("file.txt", Res);
    }
}