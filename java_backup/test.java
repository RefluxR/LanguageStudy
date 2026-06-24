class Printer<T>{


    void print(Integer a) {
        System.out.println("A" + a);
    }
    void print(T a) { // Object a와 다른점은 
        System.out.println("Printer 인스턴스 ===================");
        System.out.println("Object!!! " + a); 
        // 자바의 오버로드된 메서드 선택 방식
        // 컴파일러 눈에 value는 그저 T일 뿐이고, T는 최악의 경우 어떤 타입이든 올 수 있는 Object급

        // 

    }
    
    void print(Number a) {
        System.out.println("C" + a);
    }

    void print(String a) {
        System.out.println("String" + a);
    }

    // void getType(Object value){
    //     System.out.println("Printer 내부 에서의 타입 = " + value.getClass().getSimpleName());
    //     System.out.println("");
    // }

    void getType(T value){
        System.out.println("Printer 내부 에서의 타입 = " + value.getClass().getSimpleName());
        System.out.println("");
    }

    void getType(String value){
        System.out.println("Printer 내부 에서의 타입 = " + value.getClass().getSimpleName());
    }
}


public class test {
    public static void main(String[] args) {
        new Container<Integer>(10).print(); // 10을 제네릭 타입으로 전달
        new Container<String>("test").print(); // String을 넣어도 정상 작동 됨
        new Container<Double>(3.14).print(); // 

  
        // est;
        System.out.println("main () -----------");
        new Printer<>().getType(333);
        new Printer<>().getType("test");
        
    }

    public static class Container<T> { // 제네릭 타입 추가
        T value;
        // value 라는 변수는 Container<T> 안에서 T 타입(즉, Object)으로 선언되어 있습니다.
        
        public Container(T t) {
            System.out.println("container 인스턴스 ===================");

            if (t instanceof Integer){
                System.out.println("integer 타입이 전달되었습니다.");
            }else if(t instanceof String){
                System.out.println("String 타입이 전달되었습니다.");
                
            }else if(t instanceof Double){
                System.out.println("Double 타입이 전달되었습니다.");
            }
            value = t;
            
        }

        public void print() {
            new Printer<>().print(value);    
            new Printer<>().getType(value);
        }
    }
}
