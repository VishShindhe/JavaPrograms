 class A {
    public A(){
        System.out.println("In constructor of class A");
    }
    public A(int n){
        this();
        System.out.println("In parameterised constructor of class A ");
    }
}
 class B extends A{
    public B(){
        System.out.println("In constructor of class B");
    }
    public B(int n){
        super(n);
        System.out.println("In parameterised constructor of class B ");
    }
}

public class Demo {
    public static void main(String a[]) {
        B obj = new B(4);
    }
}
