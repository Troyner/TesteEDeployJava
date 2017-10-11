import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Teste {

/*	
	public void questao1() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print("BUZZ");
            }
             
            if (i % 5 == 0) {
                System.out.print("BIZZ");
            }
            System.out.println("");
        }
    }

    public Integer somaDeQuadrado(List<Integer> listaNumeros) {
    	int total = 0;
        for (Integer numero : listaNumeros) {
            total += (numero * numero);
        }
        return total;
    }

public Integer questao3 () {
	List<Integer> fibonacci = new ArrayList<Integer>();
    fibonacci.add(1);
    fibonacci.add(1);
    int contador = 1;
    do {
    	contador++;
        fibonacci.add(fibonacci.get(contador - 1) + fibonacci.get(contador - 2));
    } while (fibonacci.get(contador) <= 9999);
    return fibonacci.get(contador);
}

	
	
    public Integer[] caminhoArvore(Arvore a, Integer n) {
    	Integer nodeNow =0;
    	Integer[] intArr = new Integer[0];
    	Integer count = 0;
        Arvore node = new Arvore();
        while (nodeNow != a.id) {
            Array.(intArr, intArr.Length + 1);
            intArr[count] = n;
            count++;
            checkTreeNodes(ref node, a, n);
            n = node.id;
            nodeNow = node.id;
        }
        Array.Resize(ref intArr, intArr.Length + 1);
        intArr[count] = a.id;
        return intArr;
    }

    public static void checkTreeNodes(ref Arvore node, Arvore a, int n) {
        if (a.filhos != null)
        {
            if ((a.filhos[0] != null && a.filhos[0].id == n) || (a.filhos[1] != null && a.filhos[1].id == n))
            {
                node = a;
            }
            else
            {
                if (a.filhos[0] != null)
                {
                    checkTreeNodes(ref node, a.filhos[0], n);
                }
                if (a.filhos[1] != null)
                {
                    checkTreeNodes(ref node, a.filhos[1], n);
                }
            }
        }
    }

    public  Arvore generateTree()
    {
        var no9 = new Arvore { id = 9 };   
        var no13 = new Arvore { id = 13, filhos = tree(no9, null) };
        var no12 = new Arvore { id = 12, filhos = tree(null, no13) };
        var no2 = new Arvore { id = 2, filhos = tree(no12, null) };
        var no8 = new Arvore { id = 8};
        var no10 = new Arvore { id = 10, filhos = tree(no8, null) };
        var no4 = new Arvore { id = 4, filhos = tree(no10, no2) };
        var no5 = new Arvore { id = 5};
        var no3 = new Arvore { id = 3};
        var no6 = new Arvore { id = 6 };
        var no11 = new Arvore { id = 11, filhos = tree(no6, no5) };
        var no7 = new Arvore { id = 7, filhos = tree(no3, no11) };
        var no1 = new Arvore { id = 1, filhos = tree(no4, no7) };
        return no1;
    }

    static Arvore[] tree(Arvore noLeft, Arvore noRight )
    {
        Arvore[] tree = new Arvore[2];
        tree[0] = noLeft;
        tree[1] = noRight;
        return tree;
    }
*/
	public int acumular(Combinable combinable, int nullValue, List<Integer> list) {
		if (list.size() == 0) {
			return nullValue;
		}
		int primeiro = list.get(0);
		
		list.remove(0);
		
		return combinable.combiner(primeiro, acumular (combinable, nullValue, list));
    }


    public int somaDeQuadrados(List<Integer> listaNumeros) {
        return acumular(new Combiner(), 0, listaNumeros);
    }
/*
    public Integer retornarPosicaoPalavraTriangulo(String palavra) {
        int somaPosicaoLetra = 0;
        char[] letras = palavra.toUpperCase().toCharArray();
        for (char letra : letras) {
            somaPosicaoLetra += ((int) letra) - 64;
        }
        int aux = 1;
        int numeroTrangulo = (aux * (aux + 1)  ) / 2;
        while(somaPosicaoLetra > numeroTrangulo){
            aux++;
            numeroTrangulo = (aux * (aux + 1)) / 2;
        }
        if (somaPosicaoLetra == numeroTrangulo)
        {
            return aux;
        }
        return -1;
    }

}*/
    
    public Boolean comecaComA(String palavra) {
    	char[] letras = palavra.toUpperCase().toCharArray();
    	if (letras[0] == 'A') {
    		return Boolean.TRUE;
    	} else {
    		return Boolean.FALSE;
    	}
    }
    
	public List<List<Seat>> ordenarSeat(SeatMap seatMap) {
		List<Seat> seats = seatMap.getSeats();
		
		
		
		Collections.sort((List<Seat>) seats, new YComparator());
		
		List<List<Seat>> listaSeats = new ArrayList<List<Seat>>();
		
		List<Seat> seatsAux = new ArrayList<Seat>();
		
		int anterior = -1;
		
		for (Seat s : seats) {
			if (s.getY() == 0  && s.getY() != anterior) {
				seatsAux = new ArrayList<Seat>();
				seatsAux.add(s);
				anterior = s.getY();
			} else if (s.getY() != anterior) {
				listaSeats.add(seats);
				seatsAux = new ArrayList<Seat>();
				seatsAux.add(s);
				anterior = s.getY();
			} else {
				seatsAux.add(s);
				anterior = s.getY();
			}
		}
		
		for (List<Seat> l : listaSeats) {
			Collections.sort(l, new XComparator());
		}
		
		return listaSeats;
	}
    
}
