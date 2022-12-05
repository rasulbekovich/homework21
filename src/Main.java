import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("alphabet");
            writer.write("""
                    Aa
                    Bb
                    Cc
                    Dd
                    Ee
                    Ff
                    Gg
                    Hh
                    Ii
                    Jj
                    Kk
                    Ll
                    Mm
                    Nn
                    Oo
                    Pp
                    Qq
                    Rr
                    Ss
                    Tt
                    Uu
                    Vv
                    Ww
                    Xx
                    Yy
                    Zz
                    """);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader reader=new FileReader("alphabet");
            Scanner scanner=new Scanner(reader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}



