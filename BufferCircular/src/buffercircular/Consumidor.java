package buffercircular;

public class Consumidor implements Runnable {
    
    private BoundedBuffer buffer;
    
    public Consumidor(BoundedBuffer buffer){
        
        this.buffer = buffer;
        
    }
    
    @Override
    public void run(){
        while(true){
            
            JobUtil.atrasar(5);
            int dado = buffer.remover();
            
        }
    }
    
}
