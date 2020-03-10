package project2;

public class Stack
{
	static Long[] array = new Long[10];
	static int top = -1;
    public void push(Long i) {
    	if(top<9)
    	{
    		array[++top]=i;
    	}
    	else
    	{
    		System.out.println("Stack is full!");
    	}
    }
    
    public Long pop() {
    	if(top>-1)
    	{
    		return array[top--];
    	}
    	else
    	{
    		System.out.println("Stack is empty!");
    	}
		return null;
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack();
//        stack.push(5L);
//        stack.push(2L);
//        System.out.println(stack.pop());
        
        for (int i=0;i<=10;i++)
        {
        	stack.push(Long.valueOf(i));
        }
        
        for (int i=0;i<=10;i++)
        {
        	System.out.println(stack.pop());
        }
    }
}