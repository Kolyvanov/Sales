public class Main {
    public static void main(String[] args) {
        long[] a = {1, 3, 5, 7, 21};
        SalesManager manager = new SalesManager(a);
        System.out.println(manager.max());
        System.out.println();
        System.out.println(manager.average());
        System.out.println();
        SalesManager manager1 = new SalesManager(new long[] {23, 5, 11});
        System.out.println(manager1.average());
    }
}
