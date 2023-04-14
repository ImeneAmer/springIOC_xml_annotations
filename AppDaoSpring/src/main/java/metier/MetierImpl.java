package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier") // utiliser l'annotation @Service pour faire la différence entre la couche métier et couche BD
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("dao")
    private IDao dao; // couplage faible

    /*
    l'injection des dépendence peut se faire par :
    utilisation d'un constructeur avec parametre au lieu
    de l'annotation @Autowired
    puis déclarer la balise constructor dans le fichier config.xml
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    */
    @Override
    public double calcul() {

        double data=dao.getData();
        double res=data*11.4;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
