package iut.bad;

public class Humain {
    private String nom;
    private String prenom;
    private int age;
    private Humain ami;
    private int nombreJour;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.nombreJour = 100;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void ami(Humain friend){
        this.ami = friend;
    }
    public Humain getAmi(){
        return ami;
    }
    public void ami(int nombreJour){
        this.nombreJour = nombreJour;
    }
    public int getAmiNbJour(){
        return nombreJour;
    }
}
