// package book;

public class Demo {
 public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs= new BookShop();
        bs.loadData();
        bs.setShopName("Shop 1");

        BookShop bs1=(BookShop)bs.clone();
        bs1.setShopName("Shop 2");

        bs.getBooks().remove(2);
        System.out.println(bs);
        System.out.println(bs1);
    }   
}
