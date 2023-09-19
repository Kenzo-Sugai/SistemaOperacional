package buffercircular;

public class BufferCircular {

    public static void main(String[] args) throws InterruptedException {
       
        int size = 5;
        int dado = 0;
        while(true){
            
            System.out.println(dado + " ");
            dado = (dado + 1) % size;
            Thread.sleep(1000);
            
        }
        
    }
    
}
