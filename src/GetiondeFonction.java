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
    public static void aff(){
        if (stock.isEmpty()){
            System.out.println("aucun utilisateur !!");
        }
        for (Utilisateur i : stock){
            System.out.println(i);
        }
    }

    public static void supp(){
        System.out.print("Entrer email pour supprimer un utilisateur :) : " );
        String email = input.next();
        boolean supprimer = false;
        for (Utilisateur i : stock){
            if (i.getEmail().equals(email)){
                stock.remove(i);
                supprimer = true;
                break;
            }
        }
        if (supprimer == false){
            System.out.println("aucun utilisateur trouvé avec cet email ");
        }
    }

}
