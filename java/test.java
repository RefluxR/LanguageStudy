public class test {
    
    interface F{
        int apply(int x);
    }

    public static void run(F f){

        f.apply(3);
    }

    public static void main(String[] args){

        run((int n) -> n + 9);
    }

}
