package fnj.com.br.escolhaimparcial;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by meiji on 21/03/2018.
 */

public class Criterios {
    List<String> criterios;
    List<String> criterios_not_family;


    public Criterios(){
        criterios = new ArrayList();
        criterios_not_family = new ArrayList();

    }

    public void addCriterio(String crit) {
        criterios.add(crit);
    }
    public void addCriterioNotFamily(String crit) {
        criterios_not_family.add(crit);
    }

    public String getCriterio() {
        Collections.shuffle(criterios);
        return criterios.get(0);
    }
    public String getCriterioNotFamily() {
        Collections.shuffle(criterios_not_family);
        return criterios_not_family.get(0);
    }
}
