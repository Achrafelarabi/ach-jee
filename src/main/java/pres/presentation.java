package pres;

import dao.DaoImp;
import ext.DaoImp2;
import metier.metierImpl;

public class presentation {
    public static void main(String[] args) {

        /* injection des dépendances par instonciationstatique
        =>new
        */

        DaoImp2 dao=new DaoImp2();
        metierImpl metier=new metierImpl();
        metier.setDao(dao);
        System.out.println("Resultat=" +metier.calcul());
    }
}
