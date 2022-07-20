public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 21};
        SalesManager manager = new SalesManager(a);
        System.out.println(manager.max());
    }
}
