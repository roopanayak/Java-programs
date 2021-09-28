package MyProject;

import java.util.*;
class StudCompare implements Comparator<Student>
{
        @Override
                public int compare(Student stud1, Student stud2)
        {
                if (stud1.getReg() < stud2.getReg())
                {
                        return 1;
                }
                return -1;
        }
}
class SortList
{
        public static void main(String[] args)
        {
                LinkedList<Student> list = new LinkedList<Student>();
                list.add(new Student("John", 1001));
                list.add(new Student("Raju", 1005));
                list.add(new Student("Sham", 1000));
                list.add(new Student("Ravi", 1002));
                Collections.sort(list, new StudCompare());
                System.out.println("Sorted list based on registration number\n");
                System.out.println("**=============**=================**");
                for (Student stud: list )
                {
                        System.out.println(stud);
                }
                System.out.println("**=============**=================**\n");
        }
}