package pres;

import dao.Idiao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        Idiao dao=(Idiao) cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        Imetier metier= (Imetier) cMetier.newInstance();



        Method methode=cMetier.getMethod("setDao",Idiao.class);
        //metier.setDao(dao);
        methode.invoke(metier,dao);
        System.out.println("Résultat=>"+metier.calcul() );



    }
}
