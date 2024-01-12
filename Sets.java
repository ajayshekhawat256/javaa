import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Sets {
    public static void main(String args[]){
        HashSet<String> s1=new HashSet<>();
        s1.add("City");
        s1.add("Nepal");
        s1.add("India");
        s1.add("Turkey");
        System.out.println(s1);
        // Iterator it=s1.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.hasNext());
        // }
        for(String city:s1){
            System.out.println(city);
        }
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("City");
        lhs.add("Nepal");
        lhs.add("India");
        lhs.add("Turkey");
        System.out.println(lhs);

        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=5;
        }
        System.out.println(arr[2]);

        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] neww=new int[n];
        // for(int i=0;i<n;i++){
        //     neww[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(neww[i]+" ");
        // }
        String name=sc.next();
        System.out.println(name);
        int n=sc.nextInt();
        String[] arrrt=new String[n];
        for(int i=0;i<n;i++){
            arrrt[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.print(arrrt[i]+" ");
        }




    }
}
