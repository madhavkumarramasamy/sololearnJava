//Cat 2 
//No return type with Args
//void fn(arg)
public class numbers
{
    public void fun(int x,int y)
    {
        int z=(x+y);
        System.out.println(z);
    }
    
    public static void main(String args[])
    {
        int x=10;
        int y=20;
        numbers o=new numbers();
        o.fun(x,y);
    }
}
