import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter un utilisateur");
            System.out.println("2. Afficher les utilisateurs");
            System.out.println("3. Supprimer un utilisateur");
            System.out.println("4. Rechercher un utilisateur");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = input.nextInt();
            switch (choix){
                case 1:
                    GetiondeFonction.add();
                    break;
                case 2:
                    GetiondeFonction.aff();
                    break;
                case 3:
                    GetiondeFonction.supp();
                    break;
                case 4:
                    GetiondeFonction.rechercher();
                    break;
                case 5:
                    System.out.println("Byee !!!!");
                    break;
                default:
                    System.out.println("choix invalide ");

            }
        }while (choix !=5 );

    }
}