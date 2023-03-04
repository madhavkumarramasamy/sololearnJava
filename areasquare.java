//Category -4
//return type fn(args)

public class MyClass {
   
   
     public static void main(String args[])
    {
      MyClass o=new MyClass();
      int s=15;
      int result=o.square(s);
      System.out.println(result);
    }

    
    public int square(int s)
    {
      int a=s*s;
      return a;
    }
}
