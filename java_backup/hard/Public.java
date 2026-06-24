package hard;

public class Public {

    public static void change(String[] data, int[] data_i, String s, int i){
        data[0] = s;
        data_i[0] = 4;

        s = "Z";
        i = 3;
    }
    
    public static void main(String[] args) {
        String data[] = { "A" };
        int data_i[] = {1,2,3};
        
        String s = "B";
        int i = 0;
        
        change(data, data_i, s, i);
        System.out.print(data[0] + s + i);

        for (int l = 0; l < data_i.length; l++){
            System.out.print(data_i[l]);
        }
    }

    
}