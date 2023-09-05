
package matriz;

public class MainSerial {
    
    public static void main(String[] args){
     
        int nrcolunas = 0;
        if(args.length != 0){
            nrcolunas = Integer.parseInt(args[0]);
        } else {
            nrcolunas = 10;
        }
        
        Matriz m = new Matriz(nrcolunas);
        m.imprime();
        
        int soma = 0;
        
        for(int i = 0; i < m.linhas; i++){
            for(int j = 0; j < m.colunas; j++){
                
                soma += m.dados[i][j];
                JobUtil.atrasar(1);
                
            }
        }
        
        System.out.println("Soma: " + soma);
        
    }
    
    
}
