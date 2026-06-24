package easy.arraySame

public class arraySame {
	public static void check(int[] x, int[] y) {
		if(x==y) System.out.print("O");
		else System.out.print("N");
	}


	public static void main(String[] args) {
		int a[] = new int[] {1, 2, 3, 4};
		int b[] = new int[] {1, 2, 3, 4};
		int c[] = new int[] {1, 2, 3};
		check(a, b);
		check(b, c);
		check(a, c);

		System.out.println("\n equals() 메서드로 비교");

		System.out.println(a.equals(b)); 
		System.out.println(b.equals(c)); 
		System.out.println(a.equals(c)); 

		System.out.println("Arrays.equals() 메서드로 비교");
		System.out.println(java.util.Arrays.equals(a, b));	

	}
    
}

