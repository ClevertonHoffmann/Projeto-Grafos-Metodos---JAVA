

/**
 * Matriz de Adjacencia para grafos não direcionados
 * @author Cleverton
 */
public class MatrizAdjacenciaNaoDirecionados{

    private int qtdVertices;
    private int[][] G;

    /**
     * Construtor inicializa a quantidade de vértices 
     * e cria a matriz de Adjacencia.
     * @param qtdVertices 
     */
    public MatrizAdjacenciaNaoDirecionados(int qtdVertices) {
        G = new int[qtdVertices][qtdVertices];
        this.qtdVertices = qtdVertices;
    }

    /**
     * Método responsável pela inserção de arestas
     * @param origem
     * @param destino 
     */
    public void inserirAresta(int origem, int destino) {
            G[origem][destino] = 1;
            G[destino][origem] = 1;
    }

    /**
     * Método responsável pela remoção de arestas.
     * @param origem
     * @param destino 
     */
    public void removerAresta(int origem, int destino) {
            G[origem][destino] = 0;
            G[destino][origem] = 0;
    }

    /**
     * Método responsável por mostrar a matriz de adjacencia
     */
    public void mostrarMatriz() {
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                System.out.print(G[i][j]+"  ");
            }
            System.out.print("\n");
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
