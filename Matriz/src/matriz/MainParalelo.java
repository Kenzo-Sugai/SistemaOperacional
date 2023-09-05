
package matriz;

public class MainParalelo {
    
    public static void main(String args[]) throws InterruptedException{
        
        int nrcolunas = 0;
        if(args.length != 0){
            nrcolunas = Integer.parseInt(args[0]);
        } else{
            nrcolunas = 10;
        }
        
        Matriz m = new Matriz(nrcolunas);
        m.imprime();
        
        Somadora s1 = new Somadora(0, m);
        Somadora s2 = new Somadora(1, m);
        
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        System.out.println("Soma: " + (s1.soma + s2.soma));
        
    }
    
}
