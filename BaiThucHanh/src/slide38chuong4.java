import java.util.LinkedList;

public class slide38chuong4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C#");
        list.add("C++");
        System.out.println("vi du su dung phuong thuc ");
        System.out.println("--------------------------");

        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA:");
        showList(listA);

        System.out.println("/n vi du khoi tao rentainAll()");
        System.out.println("------------------------------");

        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.println(listA);
        showList(listA);

        System.out.println("vi du ve phuong thuc removeAll()");
        System.out.println("-----------------------------------");

        list.removeAll(listB);
        System.out.println(list);
        showList(list);
    }

    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.println("/t" + obj + ",");
        }
        System.out.println();
    }
}