public class Personne {
    String nom ;
    int age;
    String CIN;

    public Personne(String nom, int age,String CIN) {
        this.nom = nom;
        this.age = age;
        this.CIN = CIN;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getCIN() {return CIN;}

    public void setCIN(String CIN) {this.CIN = CIN;}
}
