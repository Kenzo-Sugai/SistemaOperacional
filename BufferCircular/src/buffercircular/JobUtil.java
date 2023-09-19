package buffercircular;

public class JobUtil {
   
    public static void atrasar(int tempo){
        
        int tempoAtraso = (int) (tempo * Math.random());
        
        try{
        Thread.sleep(tempoAtraso * 1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
