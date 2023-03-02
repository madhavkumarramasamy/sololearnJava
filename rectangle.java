//Cat 2 
//No return type with Args
//void fn(arg)
public class rectangle
{
    public void fun(int l,int w)
    {
        int a=(l*w);
        System.out.println(a);
    }
    
    public static void main(String args[])
    {
        int l=5;
        int w=5;
        rectangle o=new rectangle();
        o.fun(l,w);
    }
}
