package buffercircular;

public class Produtor implements Runnable {

    private BoundedBuffer buffer;
    
    public Produtor(BoundedBuffer buffer){
        this.buffer = buffer;
    }
    
    @Override
    public void run(){
        while(true){
            JobUtil.atrasar(5);
            buffer.inserir(200);
        }
    }
    
}
