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
        System.out.print("Taper le N°CNIE : ");
        String CIN = input.next();
        System.out.print("Taper le EMAIL : ");
        String email = input.next();
        System.out.print("Taper le PASSWORD : ");
        String motdepass = input.next();
        System.out.print("Taper NOM DU RÔLE (Admin-Employé-Client) : ");
        String rolname = input.next();
        Role role = new Role(rolname);
        stock.add(new Utilisateur(nom,age,CIN,email,motdepass,role));

    }
    public static void aff(){
        if (stock.isEmpty()){
            System.out.println("aucun utilisateur !!");
        }
        for (Utilisateur i : stock){
            System.out.println(i);
            System.out.println("____________________");

        }
    }

    public static void supp(){
        System.out.print("Entrer N°CNIE pour rechercher un utilisateur  : " );
        String CIN = input.next();
        boolean supprimer = false;
        for (Utilisateur i : stock){
            if (i.getCIN().equals(CIN)){
                stock.remove(i);
                System.out.println("la Rechercher est success :)");
                supprimer = true;
                break;
            }
        }
        if (supprimer == false){
            System.out.println("Aucun utilisateur trouvé avec ce N°CNIE ");
        }
    }
    public static void rechercher() {
        System.out.print("Entre N°CNIE pour Recherche un utilisateur  : ");
        String CIN = input.next();
        boolean rechercher = false;
        for (Utilisateur i : stock) {
            if (i.getCIN().equals(CIN)) {
                System.out.println(i);
                System.out.println("la Rechercher est success :)");
                rechercher = true;
                break;
            }
        }
        if (rechercher==false){
            System.out.println("Aucun utilisateur trouvé avec ce N°CNIE ");
        }
    }

}
