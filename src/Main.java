import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
        Teste test = new Teste();
/*
        //Escreva uma fun��o que imprima os n�meros de 1 a 100 e, ao lado dos n�meros m�ltiplos 
        //de 3 imprima �BUZZ�, ao lado dos m�ltiplos de 5 imprima �BIZZ� e ao lado dos m�ltiplos de 3 e 
        //5 imprima �BUZZBIZZ�.
        System.out.println("Quest�o 1");
        test.questao1();

        //Implemente a fun��o somaDeQuadrados que retorna a soma de quadrados de uma lista.
        System.out.println("");
        System.out.println("Quest�o 2");
        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        System.out.println(test.somaDeQuadrado(listaNumeros));

        //Escreva uma fun��o que retorna o primeiro elemento da sequ�ncia de Fibonacci com 5 d�gitos.
        System.out.println("");
        System.out.println("Quest�o 3");
        System.out.println(test.questao3());
*/ /*
        //Estrutura de dados:
        //  Arvore {
        //      int id;
        //      Arvore[] filhos;
        //  }
        //Escrever uma fun��o que recebe uma �rvore e um id e retorna um vetor com os ids do 
        //caminho desde o n� raiz at� o n� passado como par�metro.
        //  int[] caminho_arvore(Arvore a, int n);
        System.out.println("");
        System.out.println("Quest�o 4");
        Console.Write("[" + string.Join(",", test.caminho_arvore(test.generateTree(), 9)) + "]");
*/
        //Utilizando a fun��o:
        //function acumular(combiner, nullValue, list){
        //    if (list.length == 0) { 
        //        return nullValue; 
        //    }
        //    var primeiro = list.removePrimeiro(); 
        //    return combiner(primeiro, acumular (combiner, nullValue, list));
        //}
        //Implemente a fun��o somaDeQuadrados que retorna a soma de quadrados de uma lista.
        //somaDeQuadrados([1,2,3,4,5])
        //retorna o n�mero 55.
        //Neste caso a fun��o acumular deve ser utilizada. A vari�vel �combiner� � um 
        //�ponteiro para fun��o�. A implementa��o da fun��o �combiner� faz parte da solu��o.
        System.out.println("");
        System.out.println("Quest�o 2");
        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        System.out.println(test.somaDeQuadrados(listaNumeros));

/*
        //O termo n da sequ�ncia de �n�meros tri�ngulo� � dado pela f�rmula:
        //Portanto os primeiros n�meros da sequ�ncia s�o:
        //1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
        //Convertendo cada letra de uma palavra no n�mero correspondendo a posi��o no alfabeto e 
        //adicionando os valores, n�s obtemos o valor de uma palavra. Por exemplo, o valor da palavra 
        //            SKY � 19 + 11 + 25 = 55.
        //Se o valor da palavra � um �n�mero triangulo�, ent�o a palavra � chamada �palavra tri�ngulo�
        //Escreva uma fun��o que retorna a posi��o da sequ�ncia dado uma palavra ou -1 se a palavra 
        //n�o for uma palavra tri�ngulo.
        //int palavraTriangulo(string palavra);
        //palavraTriangulo(�SKY�) retorna 10.
        //palavraTriangulo(�ASDF�) retorna -1
        /*System.out.println("");
        System.out.println("Quest�o 6");
        System.out.println(test.retornarPosicaoPalavraTriangulo("SKY"));
        System.out.println(test.retornarPosicaoPalavraTriangulo("ASDF"));*/

    }
}
	
