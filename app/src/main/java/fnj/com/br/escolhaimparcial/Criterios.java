package fnj.com.br.escolhaimparcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by meiji on 21/03/2018.
 */

public class Criterios {
    List<String> criterios;

    public Criterios(){
        criterios = new ArrayList();
        criterios.add("O mais alto.");
        criterios.add("O mais baixo.");
        criterios.add("O mais gordo.");
        criterios.add("O mais magro.");
    }

    public String getCriterio() {
        Collections.shuffle(criterios);
        return criterios.get(0);
    }
}
