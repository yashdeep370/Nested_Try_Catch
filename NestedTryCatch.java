public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int c[]={1,2,3,4};
		System.out.println(c[5]);
            try {
                int num = 10 / 0;                 
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexoutofBounds Exception found" + e);
        }
    }
}