import java.util.Scanner;
public class Collage {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Size of Array :");
        int n = scanner.nextInt();
        Rep reps[] = new Rep[n];
        Mugavari mugavaris[] = new Mugavari[n];
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("enter the Name :");
            String qi = scanner.next();
            System.out.print("enter the Age :");
            int r = scanner.nextInt();
            System.out.print("enter the Department :");
            String si = scanner.next();
            System.out.print("enter the RollNo :");
            int t = scanner.nextInt();
            Rep rep = new Rep(qi, r,si,t);
            reps[i] = rep;

            System.out.print("enter the DoorNo :");
            int k = scanner.nextInt();
            System.out.print("enter the Street :");
            String li = scanner.next();
            System.out.print("enter the City :");
            String m = scanner.next();
            System.out.print("enter the District :");
            String o = scanner.next();
            System.out.print("enter the Pin code :");
            long p = scanner.nextLong();
            Mugavari mugavari = new Mugavari(k,li,m,o,p);
            mugavaris[i] = mugavari;
            System.out.println("\n");

        }

        for(int i = 0; i < n; i++)
        {
            System.out.println("------------------Student"+(i+1)+"------------------");
            Rep rep = reps[i];
            Mugavari mugavari = mugavaris[i];
            System.out.println(rep.getRep());
            System.out.println(mugavari.getMugavari());
            System.out.println("--------------------------------------------------\n\n");
        }
    }
}
