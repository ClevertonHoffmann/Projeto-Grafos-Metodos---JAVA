/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Cleverton
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     /*   MatrizAdjacenciaDirecionado m = new MatrizAdjacenciaDirecionado(4);
        m.inserirAresta(0, 0);
        m.inserirAresta(1, 2);
       // m.inserirAresta(3, 1);
        m.inserirAresta(1, 1);
        m.inserirAresta(3, 3);
        m.inserirAresta(2, 0);
        m.mostrarMatriz();
    */  //  m.gerarMatrizIncidencia();
        ListaAdjacencia l = new ListaAdjacencia(6);
      //  l.inserirAresta(0, 0);
       // l.inserirAresta(1, 2);
      //  l.inserirAresta(1, 0);
      //  l.inserirAresta(1, 1);
     //   l.inserirAresta(3, 3);
      //  l.inserirAresta(2, 0);
        l.inserirAresta(4, 2);
        l.inserirAresta(4, 5);
     //   l.inserirAresta(5, 1);
        l.inserirAresta(5, 3);
     //   l.inserirAresta(0, 0);
       
       // l.inserirAresta(1, 2);
     //   l.inserirAresta(2, 3);
        l.inserirAresta(3, 1);
       // l.inserirAresta(2, 3);
       // l.inserirAresta(3, 4);
       // l.inserirAresta(4, 5);
       // l.inserirAresta(5, 0);
      
      
        l.cicloHamiltoniano();
     //   l.mostrarListaVertice(2);
   //     System.out.println(l.verificaVerticeNull(2));
    //    l.removeAresta(0, 0);
    //   l.removeAresta(3, 1);
    //    l.removeAresta(3, 3);
        
     //     l.mostrarLista();
    //      l.buscaLargura(4);
    //       System.out.println("\n");
    //      l.buscaProfundidade(4);
          
   /*    l.cicloHamiltoniano(l.getlista()); */
    }
}
