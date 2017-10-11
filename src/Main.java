import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
        Teste test = new Teste();
/*
        //Escreva uma função que imprima os números de 1 a 100 e, ao lado dos números múltiplos 
        //de 3 imprima “BUZZ”, ao lado dos múltiplos de 5 imprima “BIZZ” e ao lado dos múltiplos de 3 e 
        //5 imprima “BUZZBIZZ”.
        System.out.println("Questão 1");
        test.questao1();

        //Implemente a função somaDeQuadrados que retorna a soma de quadrados de uma lista.
        System.out.println("");
        System.out.println("Questão 2");
        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        System.out.println(test.somaDeQuadrado(listaNumeros));

        //Escreva uma função que retorna o primeiro elemento da sequência de Fibonacci com 5 dígitos.
        System.out.println("");
        System.out.println("Questão 3");
        System.out.println(test.questao3());
*/ /*
        //Estrutura de dados:
        //  Arvore {
        //      int id;
        //      Arvore[] filhos;
        //  }
        //Escrever uma função que recebe uma árvore e um id e retorna um vetor com os ids do 
        //caminho desde o nó raiz até o nó passado como parâmetro.
        //  int[] caminho_arvore(Arvore a, int n);
        System.out.println("");
        System.out.println("Questão 4");
        Console.Write("[" + string.Join(",", test.caminho_arvore(test.generateTree(), 9)) + "]");
*/
        //Utilizando a função:
        //function acumular(combiner, nullValue, list){
        //    if (list.length == 0) { 
        //        return nullValue; 
        //    }
        //    var primeiro = list.removePrimeiro(); 
        //    return combiner(primeiro, acumular (combiner, nullValue, list));
        //}
        //Implemente a função somaDeQuadrados que retorna a soma de quadrados de uma lista.
        //somaDeQuadrados([1,2,3,4,5])
        //retorna o número 55.
        //Neste caso a função acumular deve ser utilizada. A variável “combiner” é um 
        //“ponteiro para função”. A implementação da função “combiner” faz parte da solução.
        System.out.println("");
        System.out.println("Questão 2");
        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        System.out.println(test.somaDeQuadrados(listaNumeros));

/*
        //O termo n da sequência de “números triângulo” é dado pela fórmula:
        //Portanto os primeiros números da sequência são:
        //1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
        //Convertendo cada letra de uma palavra no número correspondendo a posição no alfabeto e 
        //adicionando os valores, nós obtemos o valor de uma palavra. Por exemplo, o valor da palavra 
        //            SKY é 19 + 11 + 25 = 55.
        //Se o valor da palavra é um “número triangulo”, então a palavra é chamada “palavra triângulo”
        //Escreva uma função que retorna a posição da sequência dado uma palavra ou -1 se a palavra 
        //não for uma palavra triângulo.
        //int palavraTriangulo(string palavra);
        //palavraTriangulo(“SKY”) retorna 10.
        //palavraTriangulo(“ASDF”) retorna -1
        /*System.out.println("");
        System.out.println("Questão 6");
        System.out.println(test.retornarPosicaoPalavraTriangulo("SKY"));
        System.out.println(test.retornarPosicaoPalavraTriangulo("ASDF"));*/

    }
}
	
