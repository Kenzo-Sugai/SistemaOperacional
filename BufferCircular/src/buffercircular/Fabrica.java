package buffercircular;

public class Fabrica {
    
    public static void main(String[] args){
        
        BoundedBuffer buffer = new BoundedBuffer();
        
        Thread produtora = new Thread(new Produtor(buffer));
        Thread consumidora = new Thread(new Consumidor(buffer));
        
        produtora.start();
        consumidora.start();
        
    }
    
    
    
    
}
