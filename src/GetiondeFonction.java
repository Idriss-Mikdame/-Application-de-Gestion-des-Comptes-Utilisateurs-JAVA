import java.util.ArrayList;
import java.util.Scanner;

public class GetiondeFonction {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Utilisateur> stock = new ArrayList<>();

    public static void add(){
        System.out.print("Taper le Nom : ");
        String nom = input.next();
        System.out.print("Taper le AGE : ");
        int age = input.nextInt();
        System.out.print("Taper le EMAIL : ");
        String email = input.next();
        System.out.print("Taper le PASSWORD : ");
        String motdepass = input.next();
        System.out.print("Taper rolename (Admin-Employé-Client) : ");
        String rolname = input.next();
        Role role = new Role(rolname);
        stock.add(new Utilisateur(nom,age,email,motdepass,role));

    }

}
