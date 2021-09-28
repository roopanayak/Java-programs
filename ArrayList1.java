package MyProject;

import java.util.*;

class ArrayList1
{
        public static void main(String[] args)
        {
                ArrayList<String> al = new ArrayList<String>();
                System.out.println("Size of ArrayList: "+al.size());
                
                al.add("Roopa");
                al.add("Naik");
                
                System.out.println("Elements of first ArrayList: "+al);

                ArrayList<String> al2 = new ArrayList<String>();
                
                al2.add("Roja");
                al2.add("nayak");
                
                al2.addAll(al);
                
                System.out.println("Elements of second ArrayList: "+al2);
                
                al2.remove("EJB");
                System.out.println("Elements of ArrayList after deletion: "+al2);
                System.out.println("Size of ArrayList: "+al2.size());

                System.out.println("The element at 2nd index is: "+al2.get(2));
        }
}









