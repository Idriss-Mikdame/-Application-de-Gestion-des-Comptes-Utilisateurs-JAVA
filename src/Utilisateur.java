public class Utilisateur extends Personne {
    String email;
    String motdepass;
    Role role;

    public Utilisateur(String nom, int age,String CIN, String email, String motdepass, Role role) {
        super(nom, age,CIN);
        this.email = email;
        this.motdepass = motdepass;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdepass() {
        return motdepass;
    }

    public void setMotdepass(String motdepass) {
        this.motdepass = motdepass;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }



    @Override
    public String toString() {
        return
                        "------AFFICHAGE UTILISATEUR A ETE AJOUTE------\n"+
                        "Nom-------->  " + getNom() +"\n"+
                        "CIN-------->  " +getCIN() +"\n"+
                        "Age-------->  "   +getAge()+"\n"+
                        "Email------>  " + getEmail() +"\n"+
                        "Role------->  " + getRole().getRolename();
    }
}
