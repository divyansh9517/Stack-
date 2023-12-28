public class sta{
    static int n=6;
    static int top=-1;
    static int stack[]=new int[n];
    public void push(int x)
    {
        if(top==n)
        {
            System.out.println(" stack is overflow ");
        }
        else {
            //
            top=top+1;
            stack[top]=x;
        }
        return;
    }

    public void pop()
    {
        if(top<0)
        {
            System.out.println(" stack is underflow ");
        }else {
            int x=stack[top];
            top=top-1;
        }
    }
    public void Pushprint()
    {

        for(int i =0;i<=top;i++){
            System.out.print(" "+ stack[i]);
        }
    }

    public static void main(String[] ars)
    {
        sta s=new sta();
        s.push(5);
        s.push(6);
        s.push(70);
        s.pop();
        s.pop();
        s.Pushprint();
    }
}
