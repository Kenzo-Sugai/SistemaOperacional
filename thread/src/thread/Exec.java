/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author unifksugai
 */
public class Exec implements Runnable{
    private int ID;
    
    public Exec(int id){
        this.ID = id;
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        System.out.println("Hello World: "+ ID);
        }
    }
}