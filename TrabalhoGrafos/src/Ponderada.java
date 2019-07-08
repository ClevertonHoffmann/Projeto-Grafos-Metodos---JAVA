
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cleverton
 */
public class Ponderada {
    Scanner ler;
    MatrizAdjacenciaDirecionado m;
    MatrizAdjacenciaNaoDirecionados n;
    
    private int qtdVerticesGP;
    private int[][] GP;
    /**
     * Cria grafo matriz ponderada
     * @param qnt 
     */
    public Ponderada(int qnt){
        this.gerarMatriz(qnt);
    }
    
    public void gerarMatriz(int qnt){
        System.out.println("Digite o tipo de grafo Direcionado 1 - Não Direcionado");
        int tipo = ler.nextInt();
        if(tipo==1){        
        m = new MatrizAdjacenciaDirecionado(qnt);
        System.out.println("Digite os pares de vértice de dois em dois (origem, destino)");
        gerarMatrizPonderadaDir();
        }else{
        n = new MatrizAdjacenciaNaoDirecionados(qnt);
        gerarMatrizPonderadaNaoDir();
        }
    }
    
    
    public void gerarMatrizPonderadaDir(){
        qtdVerticesGP=0;
        for (int i = 0; i < m.getQtdVertices(); i++) {
            for (int j = 0; j < m.getQtdVertices(); j++) {
                if(m.getG()[i][j]==1){
                    qtdVerticesGP++;
                }
            }
        }
        GP = new int[qtdVerticesGP][m.getQtdVertices()];
        int k=0;
        for (int i = 0; i < m.getQtdVertices(); i++) {
            for (int j = 0; j < m.getQtdVertices(); j++) {
                if(m.getG()[i][j]==1){
                    System.out.println("Digite o peso da aresta ("+k+","+i+"):");
                    GP[k][i]= ler.nextInt();;
                    System.out.println("Digite o peso da aresta ("+k+","+j+"):");
                    GP[k][j]= ler.nextInt();;
                    k++;
                }
            }
        }
    }
    
    public void gerarMatrizPonderadaNaoDir(){
        qtdVerticesGP=0;
        for (int i = 0; i < n.getQtdVertices(); i++) {
            for (int j = 0; j < n.getQtdVertices(); j++) {
                if(n.getG()[i][j]==1){
                    qtdVerticesGP++;
                }
            }
        }
        GP = new int[qtdVerticesGP][n.getQtdVertices()];
        int k=0;
        for (int i = 0; i < n.getQtdVertices(); i++) {
            for (int j = 0; j < n.getQtdVertices(); j++) {
                if(n.getG()[i][j]==1){
                    
                    GP[k][i]= ler.nextInt();
                    
                    GP[k][j]= ler.nextInt();
                    k++;
                }
            }
        }
    }
    
}
