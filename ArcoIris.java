import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArcoIris {

    public static void main(String[] args) {
        // Crie um conjunto e adicione as cores do arco-íris
        ArrayList<String> coresArcoIris = new ArrayList<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");
        System.out.println();

        //Exibir todas as cores uma abaixo da outra
        System.out.println("A. Cores do arco-íris:");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println();


        //Quantidade de cores que o arco-íris tem
        System.out.println("Quantidade de cores do arco-íris: " + coresArcoIris.size()+" Cores");
        System.out.println();


        //Exibir as cores em ordem alfabética
        Collections.sort(coresArcoIris);
        System.out.println("Cores do arco-íris em ordem alfabética:");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println();


        //Exibir as cores na ordem inversa da que foi informada
        Collections.reverse(coresArcoIris);
        System.out.println("Cores do arco-íris em ordem inversa:");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println();


        //Exibir todas as cores que começam com a letra "v"
        System.out.println("Cores do arco-íris que começam com a letra 'v':");
        for (String cor : coresArcoIris) {
            if (cor.toLowerCase().startsWith("v")) {
                System.out.println(cor);
            }
        }
        System.out.println();


        // Remova todas as cores que não começam com a letra "v"
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            if (!cor.toLowerCase().startsWith("v")) {
                iterator.remove();
            }
        }
        System.out.println();

        System.out.println("Cores do arco-íris após remover as que não começam com 'v':");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println();


        // Limpar o conjunto
        coresArcoIris.clear();
        System.out.println("Conjunto de cores do arco-íris após limpar:");
        System.out.println(coresArcoIris);
        System.out.println();


        // Verificar se o conjunto está vazio
        boolean conjuntoVazio = coresArcoIris.isEmpty();
        System.out.println("O conjunto de cores do arco-íris está vazio? " + conjuntoVazio);
    }
}
