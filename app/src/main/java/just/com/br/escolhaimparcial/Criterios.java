package just.com.br.escolhaimparcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by meiji on 21/03/2018.
 */

public class Criterios {
    List<String> criterios;
    List<String> criterios_not_family;
    List<String> criterios_mes_aniversario;
    List<String> criterios_dia_aniversario;
    List<String> criterios_signo;
    List<String> criterios_telefone;



    public Criterios(){
        criterios = new ArrayList();
        criterios_not_family = new ArrayList();
        criterios_mes_aniversario = new ArrayList();
        criterios_dia_aniversario = new ArrayList();
        criterios_signo = new ArrayList();
        criterios_telefone = new ArrayList();
    }

    public void addCriterio(String crit) {
        criterios.add(crit);
    }
    public void addCriterioNotFamily(String crit) {
        criterios_not_family.add(crit);
    }
    public void addCriterioMesAniversaio(String crit) { criterios_mes_aniversario.add(crit);}
    public void addCriterioDiaAniversaio(String crit) { criterios_dia_aniversario.add(crit);}
    public void addCriterioSigno(String crit) { criterios_signo.add(crit);}
    public void addCriterioTelefone(String crit) { criterios_telefone.add(crit);}

    public String getCriterio() {
        Collections.shuffle(criterios);
        return criterios.get(0);
    }
    public String getCriterioNotFamily() {
        Collections.shuffle(criterios_not_family);
        return criterios_not_family.get(0);
    }
    public String getCriterioMesAniversario() {
        Collections.shuffle(criterios_mes_aniversario);
        return criterios_mes_aniversario.get(0);
    }
    public String getCriterioDiaAniversario() {
        Collections.shuffle(criterios_dia_aniversario);
        return criterios_dia_aniversario.get(0);
    }
    public String getCriterioTelefone() {
        Collections.shuffle(criterios_telefone);
        return criterios_telefone.get(0);
    }
    public String getCriterioSigno() {
        Collections.shuffle(criterios_signo);
        return criterios_signo.get(0);
    }
}
