/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estructuras;

/**
 *
 * @author pablo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static <E extends Monoide<E>> E sumaArray(E[] A) throws VacioException
    {
        int n = A.length;
        if(n==0) throw VacioException.getInstancia();
        
        E sum = A[0].getNeutro();
        for(int i=0;i<n;i++)
        {
            sum = sum.suma(A[i]);
        }
        
        return sum;
        
    }
    
    public static void main(String[] args) {
        
        Z10 x = new Z10(17);
        //System.out.print(x.suma(new Z10(-18)));
        
        Z10[] A = new Z10[10];
        
        for(int i=0; i<=9; i++)
        {
            A[i] = new Z10(i);
        }
        
         for(int i=0; i<=9; i++)
        {
            System.out.print(A[i].toString());
        }
         for(int i=0; i<=9; i++)
        {
            System.out.print(A[i].getInverso().toString());
        }
         
        try
        {
            System.out.print(sumaArray(A));
        }
        catch(VacioException e)
        {
            System.out.print(e.getMessage());
        }
        
    }
    
}
