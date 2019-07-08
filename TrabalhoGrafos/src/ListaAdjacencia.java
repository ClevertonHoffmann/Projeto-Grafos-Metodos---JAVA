

import java.util.ArrayList;

/**
 * Algoritmo com métodos de implementação de lista de Adjacencia
 * @author Cleverton
 */
public class ListaAdjacencia {
    
    protected class vertice {
        int num;
        vertice prox;
    }
    private vertice listaAdj[];
    private int qtdVertices;

    public ListaAdjacencia(int qtdVertices) {
        this.qtdVertices = qtdVertices;
        this.listaAdj = new vertice[qtdVertices];
    }

    public void inserirAresta(int origem, int destino) {

       vertice novo = new vertice();
        novo.num = destino;
        novo.prox = listaAdj[origem];
        listaAdj[origem] = novo;
/*
        if (origem != destino) {
          vertice  novo = new vertice();
            novo.num = origem;
            novo.prox = listaAdj[destino];
            listaAdj[destino] = novo;
        }*/
    }

    public void mostrarLista() {
        vertice v;
        for (int i = 0; i < this.qtdVertices; i++) {
            v = listaAdj[i];
            System.out.println("Vértice" + i + " ");
            while (v != null) {
                System.out.println("(" + i + "," + v.num + ")" + " ");
                v = v.prox;
            }
        }
    }
    
    public void mostrarListaVertice(int origem) {
        vertice v;
            v = listaAdj[origem];
            System.out.println("Vértice" + origem + " ");
            while (v != null) {
                System.out.println("(" + origem + "," + v.num + ")" + " ");
                v = v.prox;
            }
    }

    public boolean verificaVerticeNull(int origem) {
        vertice v;
            v = listaAdj[origem];
            if (v == null) {
                return true;
            }else
            return false;
    }

    /**
     * Método privado de remoção de aresta
     *
     * @param origem
     * @param destino
     */
    private void removerArestaInterno(int origem, int destino) {
        vertice aux = listaAdj[origem];
        vertice anterior = null;
        if (aux != null) {
            while (aux != null) {
                if (aux.num == destino) {
                    //o vértice removido é o primeiro da lista
                    if (aux == listaAdj[origem]) {
                        listaAdj[origem] = aux.prox;
                        aux = listaAdj[origem];

                    } //o vértice removido é o ultimo da lista
                    else if (aux.prox == null) {
                        anterior.prox = null;
                        aux = null;
                    } else {
                        //o vertice removido está no meio da lista
                        anterior.prox = aux.prox;
                        aux = aux.prox;

                    }
                } else {
                    anterior = aux;
                    aux = aux.prox;

                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    /**
     * Meu metodo de remover aresta
     *
     * @param origem
     * @param destino
     */
    public void removeAresta(int origem, int destino) {
        this.removerArestaInterno(origem, destino);
        this.removerArestaInterno(destino, origem);
    }

    public void buscaLargura(int origem) {
        vertice v = listaAdj[origem];
        int[] vetor = new int[qtdVertices];
        int k = 0;
        int i = 1;
        boolean b = true;
        if (v != null) {
            while (i != qtdVertices) {
                while (v != null) {
                    for (int v2 : vetor) {
                        if (v2 == v.num) {
                            b = false;
                        }
                    }
                    if (b) {
                        vetor[k] = v.num;
                        k++;
                    }
                    v = v.prox;
                }
                v = listaAdj[vetor[i]];
                i++;
            }
        } else {
            System.out.println("Vértice vazio");
        }
        for (int v1 : vetor) {
            System.out.println(v1);
        }
    }

    public void buscaProfundidade(int origem) {
        vertice aux = listaAdj[origem];
        ArrayList<Integer> visitados = new ArrayList();
        int k = 0;
        boolean b = true;
        visitados.add(origem);
        System.out.println(origem);            
        while (aux !=null) {
            for(int v : visitados){
                if(v == aux.num){
                    b = false;
                }
            }
            if(b){
                visitados.add(aux.num);
                System.out.println(aux.num);
                aux = listaAdj[visitados.get(k+1)];
                k++;
            }else{
                aux = aux.prox;
                b = true;
            }
        }
    }

    public void cicloHamiltoniano() {
        int cont = 0;
        boolean bol = false;
        for (int k=0; k< this.qtdVertices; k++){
            vertice adj = listaAdj[k];
            vertice aux = listaAdj[k];
            while (adj!=null){
                if(listaAdj[adj.num]!=null){
                    adj = listaAdj[adj.num].prox;
                    cont++;
                }else {
                    cont = 0;
                    adj = listaAdj[adj.num];
                }
                if(cont==qtdVertices){
                    System.out.println("Ciclo Hamiltoniano");
                    bol = true;
                    break;   
                }
            }
            if(bol){
                break;
            }
        }
        if(!bol){
            for (int t=0; t< this.qtdVertices; t++){
                vertice adj1 = listaAdj[t];
                vertice aux1 = listaAdj[t];
            while (adj1!=null && bol == false){
                if(listaAdj[adj1.num]!=null){
                    if(aux1.num==adj1.num){
                    System.out.println("Grafo Semi-Hamiltoniano");
                    bol = true;
                    break;
                    }
                }else {
                    adj1 = listaAdj[t].prox;
                }
            }        
            }
        }
        if(!bol){
            
            System.out.println("Grafo Não Hamiltoniano");
        }
    }
    
    public vertice[] getlista(){
        return this.listaAdj;
    }
    
    
    public int getQtdVertices(){
        
        
     return 1;   
    }    
}
