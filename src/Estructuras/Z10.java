/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author pablo
 */
public class Z10 implements Grupo<Z10> {
    
    private int n;
    
    public Z10 (int n)
    {
        if(n%10<0) {this.n=n%10+10;}
        
        else this.n=n%10;
        
        
    }
    public Z10 getNeutro()
    {
        return  new Z10(0);
    }
    
    public Z10 suma(Z10 m)
    {
        return new Z10((this.n + m.n)%10) ;
    }
    
    public Z10 getInverso()
    {
        return new Z10((-this.n)%10);
    }
     
    public String toString()
    {
        return "["+this.n+"]";
    }
     
    
}
