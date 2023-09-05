
package matriz;


public class Somadora implements Runnable {
    
    int soma;
    int linha;
    Matriz m;
    
    public Somadora(int linha, Matriz m){
        this.m = m;
        this.linha = linha;
        soma = 0;
    }
    
    @Override
    public void run(){
        
        for(int i = 0; i < m.colunas; i++){
            soma += m.dados[linha][i];
            JobUtil.atrasar(1);
        }
        
    }
    
    
}
