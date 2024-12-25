public class Utilisateur extends Personne {
    String email;
    String motdepass;
    Role role;

    public Utilisateur(String nom, int age, String email, String motdepass, Role role) {
        super(nom, age);
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
                "nom-------->" + getNom() +"\n"+
                        "Age-------->"+getAge()+"\n"+
                        "email------>" + getEmail() +"\n"+
                        "role------->" + getRole().getRolename();
    }
}
