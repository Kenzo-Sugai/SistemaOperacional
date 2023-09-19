/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buffercircular;

/**
 *
 * @author unifksugai
 */
public class BoundedBuffer {
    
    private static final int BUFFER_SIZE = 5;
    private int[] buffer;
    private int in, out;
    private int contador;
    
    public void BoundedBuffer(){
        in = 0;
        out = 0;
        buffer = new int[BUFFER_SIZE];
        contador = 0;
    }
    
    public void inserir(int dado){
        while(contador == BUFFER_SIZE){
            System.out.print("*");
            ; // espera ocupada
        }
        
        buffer[in] = dado;
        in = (in + 1) % BUFFER_SIZE;
        
        contador++;
        System.out.println("Prod. contador: "+ contador);
    }
    
    public int remover(){
        
        while(contador == 0){
            System.out.print("#");
            ; // espera ocupada
        }
        int dado = buffer[out];
        out = (out + 1) % BUFFER_SIZE;
        contador--;
        System.out.println("Cons. contador: "+ contador);
        return dado;
        
    }
    
}
