
import java.util.Scanner;
public class OppgaveO3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Skriv et helt tall som er større enn 0:");
        long heltall= 1;
        long fakultet=1;
        String skrivEtHeltall=in.nextLine();
        long n=Integer.parseInt(skrivEtHeltall);

    for(long i=1; i<=n; i++)
    {
        fakultet*= i;


}
        System.out.print("Her er summen "+fakultet);
    in.close();
    }
}
