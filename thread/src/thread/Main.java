package thread;

public class Main {

    public static void main(String[] args)
        throws InterruptedException{
        
        System.out.println("Criando threads");
        
        Thread t1 = new Thread(new Exec(1));
        t1.start();
        
        Thread t2 = new Thread(new Exec(2));
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("Todas threads acabaram");
    }
    
}
