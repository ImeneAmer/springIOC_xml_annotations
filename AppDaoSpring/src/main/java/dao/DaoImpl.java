package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component("dao") // utiliser l'annotation @Repository pour faire la différence entre la couche métier et couche BD
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version base de donnees");

        double data=34;
        return data;
    }
}