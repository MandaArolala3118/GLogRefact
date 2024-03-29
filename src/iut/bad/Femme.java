package iut.bad;

public class Femme  extends Humain{
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    } 
    @Override
    public String toString() {
        return "Homme - " + super.toString();
    }   
    public static void main(String[] args) {
		Homme homme1 = new Homme("Doe", "John", 30);
        Femme femme1 = new Femme("Doe", "Jane", 25);
        femme1.ami(homme1);
        Humain ami = femme1.getAmi();
        System.err.println(femme1.getPrenom()+ " est ami(e) avec "+ ami.getPrenom() );
        System.err.println("Nombre de jour =" + ami.getAmiNbJour());
    
    
	} 
}

