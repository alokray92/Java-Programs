package com.java.object;

class Furniture
{

      void shape() {
        System.out.println("In furniture Shape");
    }
}
 
class Chair extends Furniture
{
	
    public void pst() {
                System.out.println("In Chair Positi");
    }
    void shape() {
        System.out.println("In Chair Shape");
    }
}
 
public class Inherit 
{
    public static void main(String[] args) 
    {
            Chair ch = new Chair();
            dothings(ch);
    }
    static void dothings(Chair frn) {
        frn.shape();
 
    }
}