import java.util.*;
public class Emptable{
    public static void main(String[] args){
    Map < Integer,Employee > map = new HashMap<>();
    Employee emp1 = new Employee(20, "Ajitha", "female", 50000);
    Employee emp2 = new Employee(21,"Valarmathi", "female",60000);
    Employee emp3 = new Employee(22,"Dhivya", "female",750000);
    Employee emp4 = new Employee(23,"Guru", "male",30000);
    map.put(20,emp1);
    map.put(21,emp2);
    map.put(2,emp3);
    map.put(23,emp4);
    List<Double> list = new ArrayList<>();
    for(Employee emp : map.values()){
        list.add(emp.salary);
    }
double maxsalary = Collections.max(list);
double minsalary = Collections.min(list);

System.out.println("Max salary: " + maxsalary);
System.out.println("Min salary: " + minsalary);

    
     System.out.println(list);
    }

}