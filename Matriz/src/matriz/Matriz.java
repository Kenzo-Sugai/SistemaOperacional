package matriz;

public class Matriz {

    public int[][] dados;
    public int linhas;
    public int colunas;
    
    public Matriz(int nrcolunas){
        colunas = nrcolunas;
        dados = new int[2][colunas];
        linhas = dados.length;
        
        inicializa();
        imprime();
            
    }
    
    public void inicializa(){
        
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                dados[i][j] = 1;
            }
        }
           
    }
    
    public void imprime(){
        
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(dados[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
