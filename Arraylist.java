import java.util.ArrayList;

public class Arraylist {
    public class Person{
        String name;
        int age;
        Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        
        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    
    public static int maxWater(ArrayList<Integer> height) {
        int maxWaterr = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int breadth = j - i;
                int currWater = ht * breadth;
                maxWaterr = Math.max(maxWaterr, currWater);
            }
        }
        return maxWaterr;
    }

    public static int maxWaterr(ArrayList<Integer> hright) {
        int sp = 0;
        int lp = hright.size() - 1;
        int maxWater = 0;
        while (sp < lp) {
            int height = Math.min(hright.get(sp), hright.get(lp));
            int breadth = lp - sp;
            int currWater = height * breadth;
            maxWater = Math.max(currWater, maxWater);
            if (hright.get(sp) < hright.get(lp)) {
                sp++;
            } else {
                lp--;
            }
        }
        return maxWater;
    }

    public static boolean pairSum(ArrayList<Integer> l1, int target) {
        int lp = 0;
        int rp = l1.size() - 1;
        while (lp != rp) {
            if (l1.get(lp) + l1.get(rp) == target) {
                return true;
            }
            if (l1.get(lp) + l1.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Person> p1=new ArrayList<>();

        //Person p2Person=new Person("aah",45);
       // p1.add(p2Person);
        Person p1Person=new Person();
        p1Person.age=56;

        p1.add(p1Person);
        System.out.println(p1);


       // Arraylist.Person p2Person=new Arraylist.Person("Ram", 10);
       // p1.add(p2Person);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);

        System.out.println(maxWater(list));
        System.out.println(maxWater(list));
        System.out.println(list);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        System.out.println(pairSum(l2, 12));

    }
}
