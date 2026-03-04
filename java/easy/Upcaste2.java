

class A_2 {
    int cost = 10;
    A_2(){
        System.out.print("A");
        
        outputCost();
    }
    void outputCost(){
        System.out.print(cost);
    }
}

class B_2 extends A_2 {
    int cost = 20;
    B_2(){
        System.out.print("B");
        outputCost();
    }
    void outputCost(){
        System.out.print(cost); // 메서드, 생성자에서 사용되는 변수는 가장 가까운 변수이다.
    }
}

public class Upcaste2{

    public static void main(String[] args){
        A_2 a = new B_2();
        System.out.print(a.cost);
    }

}