class A_3 {
    int a;

    public A_3(int a) {
        this.a = a;
    }

    public void display() {
        System.out.println("a=" + a);
    }
}

class B_3 extends A_3 {
    public B_3(int a) {
        super(a);
        setting();

        display(); // super.display()도 가능하지만 this.display()가 더 자연스럽다.
        
    }

    void setting(){
        a = 20;
    }
}

public class Upcaste3 {
    public static void main(String[] args) {
        A_3 obj = new B_3(10);
        B_3 abj_c = new B_3(10);

        System.out.println(obj.a);
        System.out.println(abj_c.a);
    }
}