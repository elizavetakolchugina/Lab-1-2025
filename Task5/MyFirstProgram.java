import myfirstpackage.*;
class MyFirstClass {
    public static void main(String[] s) {
		MySecondClass o = new MySecondClass(10, 10);
		int i, j;
		for (i = 1; i <= 8; i++) {
			for(j = 1; j <= 8; j++) {
				o.setFirstNumber(i);
				o.setSecondNumber(j);
				System.out.print(o.multiplication());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
