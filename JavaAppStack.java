
package javaappstack;

public class JavaAppStack {

    
    public static void main(String[] args) {
        
        Stack stack = new Stack();       
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());//здесь сначала выталкиваем элемент,и потом выводим его на экран
        stack.push(4);
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
        }
       
    }
    
}