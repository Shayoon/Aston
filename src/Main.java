import fr.exoRollerCoaster.RollerCoaster;
import poo.additionComplex.Complexe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Premier nombre: ");
        Complexe c1 = Complexe.creerComplexe();
        System.out.println("Deuxième nombre");
        Complexe c2 = Complexe.creerComplexe();
        Complexe.sommeComplexe(c1,c2);
    }
}
