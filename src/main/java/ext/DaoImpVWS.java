package ext;

import dao.Idiao;

public class DaoImpVWS implements Idiao {
    @Override
    public double getData() {
        System.out.println("Version Web service");
        return 90;
    }
}
