

/**
 * Matriz de Adjacencia para grafos não direcionados
 * @author Cleverton
 */
public class MatrizAdjacenciaDirecionado {

    private int qtdVertices;
    private int[][] G;

    /**
     * Construtor inicializa a quantidade de vértices 
     * e cria a matriz de Adjacencia.
     * @param qtdVertices 
     */
    public MatrizAdjacenciaDirecionado(int qtdVertices) {
        G = new int[qtdVertices][qtdVertices];
        this.qtdVertices = qtdVertices;
    }

    /**
     * Método responsável pela inserção de arestas
     * @param origem
     * @param destino 
     */
    public void inserirAresta(int origem, int destino) {
            if(G[destino][origem]!= 1){
            G[origem][destino] = 1;
            }
    }

    /**
     * Método responsável pela remoção de arestas.
     * @param origem
     * @param destino 
     */
    public void removerAresta(int origem, int destino) {
            G[origem][destino] = 0;
    }

    /**
     * Método responsável por mostrar a matriz de adjacencia
     */
    public void mostrarMatriz() {
        System.out.print("Matriz de Adjacencia:\n");
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                System.out.print(G[i][j]+"  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    
    public void gerarMatrizIncidencia(){
        System.out.print("Matriz de Incidencia:\n");
        int cont=0;
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                if(G[j][i]==1){
                    cont++;
                }
            }
        }
        int[][] G1 = new int[cont][qtdVertices];
        int k=0;
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                if(G[i][j]==1){
                    G1[k][i]=1;
                    G1[k][j]=1;
                    k++;
                }
            }
        }
        for (int i = 0; i < cont; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                System.out.print(G1[i][j]+"  ");
            }
            System.out.print("\n");
        }
        
    }
    
    public boolean verificaGrafoCompleto(){
        int cont=0;
        int k=0;
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                if(G[j][i]==1){
                    cont++;
                }
                if(G[i][j]==1){
                    k++;
                }
            }
        }
        if(k==cont){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificaConexo(){
        int[] vetor1 = new int[qtdVertices];
        int[] vetor2 = new int[qtdVertices];
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                if(G[i][j]==1){
                    vetor1[i]=1+vetor1[i];
                    vetor2[j]=1+vetor2[j];
                }
            }
        }
        int cont = 0;
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                if((vetor1[i]==1)&&(vetor2[j]==1)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void verificaEuleriano(){
        int[] vetor1 = new int[qtdVertices];
        int cont1 = 0;
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                if(G[i][j]==1){
                    vetor1[i]=1+vetor1[i];
                }
            }
        }
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                if(vetor1[i]%2 ==0){
                    cont1++;
                }
            }
        }
        switch (cont1) {
            case 0:
                System.out.print("Euleriano");
                break;
            case 1:
                System.out.print("Semi-Euleriano");
                break;
            default:
                System.out.print("Não Euleriano");
                break;
        }
    }

    public int getQtdVertices() {
        return qtdVertices;
    }

    public void setQtdVertices(int qtdVertices) {
        this.qtdVertices = qtdVertices;
    }

    public int[][] getG() {
        return G;
    }

    public void setG(int[][] G) {
        this.G = G;
    }
    
    
    
}
