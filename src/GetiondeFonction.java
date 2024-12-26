import java.util.ArrayList;
import java.util.Scanner;

public class GetiondeFonction {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Utilisateur> stock = new ArrayList<>();

    public static void add() {
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
        stock.add(new Utilisateur(nom, age, CIN, email, motdepass, role));

    }

    public static void aff() {
        if (stock.isEmpty()) {
            System.out.println("aucun utilisateur !!");
        }
        for (Utilisateur i : stock) {
            System.out.println(i);
            System.out.println("____________________");

        }
    }

    public static void supp() {
        System.out.print("Entrer N°CNIE pour rechercher un utilisateur  : ");
        String CIN = input.next();
        boolean supprimer = false;
        for (Utilisateur i : stock) {
            if (i.getCIN().equals(CIN)) {
                stock.remove(i);
                System.out.println("la Rechercher est success :)");
                supprimer = true;
                break;
            }
        }
        if (supprimer == false) {
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
        if (rechercher == false) {
            System.out.println("Aucun utilisateur trouvé avec ce N°CNIE ");
        }
    }

    public static void modifiere() {
        System.out.print("Entre N°CNIE pour Modifier un utilisateur  : ");
        String CIN = input.next();
        boolean modifier = false;
        for (Utilisateur i : stock) {
            if (i.getCIN().equals(CIN)) {
                int choix;
                do {
                    System.out.println("Utilisateur trouvé ! Que voulez-vous modifier ?");
                    System.out.println("1. nom");
                    System.out.println("2. age");
                    System.out.println("3. email");
                    System.out.println("4. mot de passe");
                    System.out.println("5. Role");
                    System.out.println("6. Quitte");
                    System.out.print("Votre choix : ");
                    choix = input.nextInt();
                    switch (choix) {
                        case 1:
                            System.out.print("modifier nom : ");
                            i.setNom(input.next());
                            break;
                        case 2:
                            System.out.print("modifier Age : ");
                            i.setAge(input.nextInt());
                            break;
                        case 3:
                            System.out.print("modifier Email : ");
                            i.setEmail(input.next());
                            break;
                        case 4:
                            System.out.print("modifier mot de pass : ");
                            i.setMotdepass(input.next());
                            break;
                        case 5:
                            System.out.print("modifier Role : ");
                            i.setRole(new Role(input.next()));
                            break;
                        case 6:
                            System.out.println("bye !!");
                            break;
                        default:
                            System.out.println("numero invalide");

                    }
                    modifier = true;
                } while (choix != 6);
            }
        }
        if (modifier==false){
            System.out.println("Aucun utilisateur trouvé avec ce N°CNIE ");
        }
    }
}