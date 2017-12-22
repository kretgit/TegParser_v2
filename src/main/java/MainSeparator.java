import java.io.FileWriter;
import java.io.FileReader;


public class MainSeparator {


    static String finaltext = "";
    static String textfromdestinationfile = "";

static void filewriter(String str) {

    try {

        FileWriter fw = new FileWriter("firstText.txt");
        fw.write(str);
        fw.close();
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}


static void filereader(String nameoftxtfile) {

    try {
            FileReader fr = new FileReader(nameoftxtfile);
            int c;
           // String finaltext = "";
            while ((c = fr.read()) != -1) {
                //System.out.print((char) c);
                finaltext += ((char) c);
            }

            //System.out.println(finaltext);

        } catch (Exception fnf) {
            System.out.println("there is no file to read");
        }

}

    static void filereader2(String somethingtextfile) {

        try {
            FileReader fr = new FileReader(somethingtextfile);
            int c;
            // String finaltext = "";
            while ((c = fr.read()) != -1) {
                //System.out.print((char) c);
                textfromdestinationfile += ((char) c);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }


public static void main (String[]args) {

//filewriter("it is excel file baby");
filereader("SM.txt");

System.out.println();



Separator3 s3 = new Separator3();
s3.separator3(finaltext);

filereader2("SM.txt");

filereader2("firstText.txt");
filewriter(textfromdestinationfile + "\n" + s3.parsedtext);


    }

}
