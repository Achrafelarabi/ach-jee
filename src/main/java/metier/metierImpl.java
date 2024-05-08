package metier;

import dao.Idiao;

public class metierImpl implements Imetier {
    //couplage faible
    private Idiao dao;


    @Override
    public double calcul() {
        double temp= dao.getData();
        double res=temp*540/Math.cos(temp*Math.PI);
        return res;
    }
  /*
  Injecter dans la variable diao objet class implement inter Idiao
  */
    public void setDao(Idiao dao) {
        this.dao = dao;
    }
}
