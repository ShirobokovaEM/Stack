
package javaappstack;

public class Stack {
    
    private  StackData top;

    public Stack() {
        top = null;//стек пустой
    }
    
    public int push(int newWeight) {   
        
        StackData tmp = top;
        top = new StackData();
        top.weight = newWeight;
        top.down = tmp;
        return newWeight;
    }
    
    public int pop(){
        
        int tmp = top.weight;
        top = top.down;        
        return tmp;
    }   
  
    
}
