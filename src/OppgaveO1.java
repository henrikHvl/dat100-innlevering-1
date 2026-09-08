import java.util.Scanner;

public class OppgaveO1 {

    public static void main(String[] args){

        Scanner in= new Scanner(System.in);

// Sjekk av trinnskatt

    System.out.print("Skriv din inntekt:");
    String skrivDinInntekt =in.nextLine();

    double inntekt= Double.parseDouble(skrivDinInntekt);

    double trinnskatt=0;


        if (inntekt > 226100){
            trinnskatt += (Math.min(inntekt, 318300)-226100)*0.017;

        }

          if (inntekt >318300){
              trinnskatt += (Math.min(inntekt, 725050)-318300)*0.04;
        }


        if (inntekt > 725050){
            trinnskatt += (Math.min(inntekt, 980100)-725050)*0.137;
        }

         if (inntekt > 980100){
             trinnskatt += (Math.min(inntekt, 1467200)-980100)*0.168;
        }

         if (inntekt >1467200){
             trinnskatt += (inntekt-1467200)*0.178;
        }





        System.out.println("Dette betaler du i trinnskatt "+trinnskatt+"kr");
        in.close();
    }
}
