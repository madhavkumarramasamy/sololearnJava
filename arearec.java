//Category -4
//return type fn(args)

public class MyClass {
   
   
     public static void main(String args[])
    {
      MyClass o=new MyClass();
      int l=15,w=20;
      int result=o.rectangle(l,w);
      System.out.println(result);
    }

    
    public int rectangle(int l,int w)
    {
      int a=l*w;
      return a;
    }
}
