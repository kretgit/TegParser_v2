
public class Separator3 {



    String regex1 = "[1:";
    String regex2 = "|2:";
    String regex3 = "|3:";
    String regex4 = "|4:";
    String regex5 = "|5:";

    String parsedtext = "";

    void separator3 (String someword2) {


        int simbol_count1 = 0;
        int simbol_count2 = 0;
        int simbol_count3 = 0;
        int simbol_count4 = 0;
        int simbol_count5 = 0;
        int simbol_end = 0;

        int count = 0;


        while (someword2.contains(regex5)) {


                simbol_count1 = someword2.indexOf(regex1);
                simbol_count2 = someword2.indexOf(regex2);
                simbol_count3 = someword2.indexOf(regex3);
                simbol_count4 = someword2.indexOf(regex4);
                simbol_count5 = someword2.indexOf(regex5);
                simbol_end = someword2.indexOf("]");

                System.out.println(someword2.substring(simbol_count1 + regex1.length(), simbol_count2));
                System.out.println(someword2.substring(simbol_count2 + regex2.length(), simbol_count3));
                System.out.println(someword2.substring(simbol_count3 + regex3.length(), simbol_count4));
                System.out.println(someword2.substring(simbol_count4 + regex4.length(), simbol_count5));
                System.out.println(someword2.substring(simbol_count5 + regex5.length(), simbol_end));


                parsedtext += (someword2.substring(simbol_count1 + regex1.length(), simbol_count2)) + "\n";
                parsedtext += (someword2.substring(simbol_count2 + regex2.length(), simbol_count3)) + "\n";
                parsedtext += (someword2.substring(simbol_count3 + regex3.length(), simbol_count4)) + "\n";
                parsedtext += (someword2.substring(simbol_count4 + regex4.length(), simbol_count5)) + "\n";
                parsedtext += (someword2.substring(simbol_count5 + regex5.length(), simbol_end)) + "\n";
                System.out.println();

                    someword2 = someword2.substring(simbol_end + 1);
                    count++;


            //System.out.println (someword2.length());

        }

System.out.println("итого заявок = " + count);

    }

}
