package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.m
         * Store and retrieve data from/to a database table.
         */
        ArrayList<Integer>number=new ArrayList<Integer>();
        System.out.println("Size = "+number.size());

        number.add(10);
        number.add(20);                // number.add(20);(Before remove)
        number.add(30);
        number.add(3,40);

        //System.out.println(number);
       // for (int x:number){
         //   System.out.println(x);
      //  Iterator itr= number.iterator();

      //  while (itr.hasNext())

      //  {
        //    System.out.println("    "+itr.next());

        //    }
     // for(int i:number){
       //     System.out.print(i+"  ");
       // System.out.println(number);
        //we can use also number.removeAll(number) also
        number.remove(1);{
           System.out.println("After removing Arraylist contains "+number);
        }












        System.out.println("Size ="+number.size());


    }

}
