package ext;

import dao.Idiao;

public class DaoImp2 implements Idiao {
    @Override
    public double getData() {
        System.out.println("Version capteurs");
        double temp= 6000;
        return temp;
    }
}
