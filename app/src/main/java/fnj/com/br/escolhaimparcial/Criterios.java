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


    public Criterios(){
        criterios = new ArrayList();
        /*criterios.add("A pessoa mais alta");
        criterios.add("A pessoa mais baixa");
        criterios.add("A pessoa mais gorda");
        criterios.add("A pessoa mais magra");
        criterios.add("A pessoa mais velha");
        criterios.add("A pessoa mais nova");
        criterios.add("A pessoa com os dentes mais afiados");
        criterios.add("A pessoa com o cabelo mais comprida");
        criterios.add("A pessoa careca");
        criterios.add("A pessoa com as unhas mais compridas");
        criterios.add("Quem está de camisa/camiseta/blusa vermelha");
        criterios.add("Quem está de camisa/camiseta/blusa preta");
        criterios.add("Quem está de camisa/camiseta/blusa verde");
        criterios.add("Quem está de camisa/camiseta/blusa azul");
        criterios.add("Quem está de camisa/camiseta/blusa amarela");
        criterios.add("Quem tem mais dinheiro na carteira");
        criterios.add("Quem tem menos dinheiro na carteira");
        criterios.add("O(A) dono(a) da casa");
        criterios.add("Quem usa óculos com maior grau");
        criterios.add("Quem mais reprovou na escola/faculdade (finais e conselho são desempates)");
        criterios.add("Quem mais recentemente andou de trem");
        criterios.add("Quem mais recentemente andou de avião");
        criterios.add("Quem mais recentemente andou de barco");
        criterios.add("Quem é casado a mais tempo");
        criterios.add("Quem é casado a menos tempo");
        criterios.add("Quem está encalhado a mais tempo");
        criterios.add("Quem perdeu a virgindade mais velho");
        criterios.add("Quem perdeu a virgindade mais novo");
        criterios.add("Quem fala mais idiomas");
        criterios.add("Quem tem o maior celular");
        criterios.add("Quem tem o menor celular");
        criterios.add("Quem tem o celular mais velho");
        criterios.add("Quem baixou esse app");
        criterios.add("Quem mais recentemente encheu a cara");
        criterios.add("Quem mais recentemente foi à praia");
        criterios.add("Quem mais recentemente se submeteu a uma cirurgia");
        criterios.add("Quem trabalha a mais tempo no mesmo lugar");
        criterios.add("Quem faz aniversário no dia 1");
        criterios.add("Quem faz aniversário no dia 2");
        criterios.add("Quem faz aniversário no dia 3");
        criterios.add("Quem faz aniversário no dia 4");
        criterios.add("Quem faz aniversário no dia 5");
        criterios.add("Quem faz aniversário no dia 6");
        criterios.add("Quem faz aniversário no dia 7");
        criterios.add("Quem faz aniversário no dia 8");
        criterios.add("Quem faz aniversário no dia 9");
        criterios.add("Quem faz aniversário no dia 10");
        criterios.add("Quem faz aniversário no dia 11");
        criterios.add("Quem faz aniversário no dia 12");
        criterios.add("Quem faz aniversário no dia 13");
        criterios.add("Quem faz aniversário no dia 14");
        criterios.add("Quem faz aniversário no dia 15");
        criterios.add("Quem faz aniversário no dia 16");
        criterios.add("Quem faz aniversário no dia 17");
        criterios.add("Quem faz aniversário no dia 18");
        criterios.add("Quem faz aniversário no dia 19");
        criterios.add("Quem faz aniversário no dia 20");
        criterios.add("Quem faz aniversário no dia 21");
        criterios.add("Quem faz aniversário no dia 22");
        criterios.add("Quem faz aniversário no dia 23");
        criterios.add("Quem faz aniversário no dia 24");
        criterios.add("Quem faz aniversário no dia 25");
        criterios.add("Quem faz aniversário no dia 26");
        criterios.add("Quem faz aniversário no dia 27");
        criterios.add("Quem faz aniversário no dia 28");
        criterios.add("Quem faz aniversário no dia 29");
        criterios.add("Quem faz aniversário no dia 30");
        criterios.add("Quem faz aniversário no dia 31");
        criterios.add("Quem faz aniversário em Janeiro");
        criterios.add("Quem faz aniversário em Fevereiro");
        criterios.add("Quem faz aniversário em Março");
        criterios.add("Quem faz aniversário em Abril");
        criterios.add("Quem faz aniversário em Maio");
        criterios.add("Quem faz aniversário em Junho");
        criterios.add("Quem faz aniversário em Julho");
        criterios.add("Quem faz aniversário em Agosto");
        criterios.add("Quem faz aniversário em Setembro");
        criterios.add("Quem faz aniversário em Outubro");
        criterios.add("Quem faz aniversário em Novembro");
        criterios.add("Quem faz aniversário em Dezembro");
        criterios.add("Quem tem a maior barba");
        criterios.add("Quem tem o maior pé");
        criterios.add("Quem tem o menor pé");
        criterios.add("Número do telefone terminado em 0");
        criterios.add("Número do telefone terminado em 1");
        criterios.add("Número do telefone terminado em 2");
        criterios.add("Número do telefone terminado em 3");
        criterios.add("Número do telefone terminado em 4");
        criterios.add("Número do telefone terminado em 5");
        criterios.add("Número do telefone terminado em 6");
        criterios.add("Número do telefone terminado em 7");
        criterios.add("Número do telefone terminado em 8");
        criterios.add("Número do telefone terminado em 9");*/
    }

    public void addCriterio(String crit) {
        criterios.add(crit);
    }

    public String getCriterio() {
        Collections.shuffle(criterios);
        return criterios.get(0);
    }
}
