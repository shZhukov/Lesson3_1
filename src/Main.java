import java.util.ArrayList;
import java.util.List;

public class Main {
     static String[] a = {"1", "2", "3", "4","5"};

    public static void main(String[] args) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
        changeStr(a);
        System.out.println();
        arrListChange(a);

    }

     public static void changeStr(String[] b){
         String temp = "";
         temp = b [0];
         b[0] = b[1];
         b[1] = temp;

         for (int i = 0; i < b.length; i++) {
             System.out.print(b[i] + " ");
         }
     }
     public static void arrListChange(String[] c){
        List<String> cList = new ArrayList<>();
         for (int i = 0; i < c.length; i++) {
             cList.add(c[i]);
         }
         for (String el : cList) {
             System.out.print(el + " ");
         }
     }

     Box<Apple> b1 = new Box();
     Box<Orange> b2 = new Box();

    public void setB1(Box<Apple> b1) {
        this.b1 = b1;
    }
}
