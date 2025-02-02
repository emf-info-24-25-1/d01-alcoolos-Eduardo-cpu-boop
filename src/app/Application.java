package app;
    
import models.Ami;

public class Application {
    public static void main(String[] args) {
        Ami zbibou = new Ami("zbibou", 5);
        Ami joachim = new Ami("joachim", 10);
        Ami viego = new Ami("viego", 2);
        do {
            zbibou.getBiere();
            zbibou.boitUneBiere();
            joachim.getBiere();
            joachim.boitUneBiere();
            viego.getBiere();
            viego.boitUneBiere();
        } while (!viego.getEstBouree() && !joachim.getEstBouree() && !zbibou.getEstBouree());
        if (viego.getEstBouree()) {
            System.out.println("viego est bouré");
        } else if (joachim.getEstBouree()) {
            System.out.println("joachim est bourée");
        } else {
            System.out.println("zbibou est bourée");
        }
    }
}