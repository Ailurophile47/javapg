public class Main {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello, World!");

        System.out.println("Original StringBuffer: " + sb);

        // Demonstrate delete()
        sb.delete(5, 7);
        System.out.println("After delete(5, 7): " + sb);

        // Demonstrate deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt(5): " + sb);

        // Demonstrate reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);
    }
}