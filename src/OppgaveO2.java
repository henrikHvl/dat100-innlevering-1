import java.util.Scanner;
public class OppgaveO2 {

    public static void main() {
        Scanner in = new Scanner(System.in);
    for (int i= 1; i<=10; i++) {

//Skrevet for å få while løkken til å kjøre en gang
        int karakter = -1;




        while (karakter < 0 || karakter > 100) {
            System.out.print("Skriv din poengsum " + i + ": ");
            String skrivDinPoengsum = in.nextLine();
            karakter = Integer.parseInt(skrivDinPoengsum);

        if(karakter < 0 || karakter > 100) {
            System.out.print("Du skrev inn feil verdi. ");

        }
    }

        if (karakter < 0) {
            System.out.println("Du skrev en ugyldig verdi");
        } else if (karakter <= 39) {
            System.out.println("din karakter er F");
        } else if (karakter < 50) {
            System.out.println("din karakter er E");
        } else if (karakter < 60) {
            System.out.println("din karakter er D");
        } else if (karakter < 80) {
            System.out.println("din karakter er C");
        } else if (karakter < 90) {
            System.out.println("din karakter er B");
        } else if (karakter <= 100) {
            System.out.println("din karakter er A");

        } else {
            System.out.println("Du skrev en ugyldig verdi");
        }

    }
    in.close();
    }
}


