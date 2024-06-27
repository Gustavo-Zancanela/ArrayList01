
import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        
        ArrayList<String> estudantes = new ArrayList<>();
        estudantes.add("Amy");
        estudantes.add("bob");
        estudantes.add("Cindy");
        estudantes.add("David");//adiciona um estudante
        estudantes.add(0, "Nick");
        estudantes.add(1, "Mike");// adiciona em um indice especifico
        estudantes.remove(3); //remove um estudante
        
        System.out.println("Nome dos estudantes: ");
        for(String nomes : estudantes)
        {
            System.out.println(nomes);// exibe os nomes dos estudantes
        }
        System.out.println("Tamanho da lista: " + estudantes.size());// exibe o tamanho da lista
    }
    
}
