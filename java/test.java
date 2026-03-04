class parent {
    int money;
    int hand_count;

    parent(int money, int hand_count){
        this.money = money;
        this.hand_count = hand_count;
    }
}

class chiled extends parent {

    String talent;

    chiled(int money, int hand_count, String talent){
        super(money, hand_count);

        System.out.println(this.money);
        System.out.println(super.money);  

        

        this.talent = talent;
        this.money = 888888;
    }

 }

public class test{
    public static void main(String[] args){
        chiled obj = new chiled(100, 2, "숨쉬기");

        System.out.println(obj.money);
        System.out.println(obj.hand_count);
        System.out.println(obj.talent);
    }
}
