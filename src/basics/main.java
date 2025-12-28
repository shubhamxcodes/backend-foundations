package basics;

public class main {
    public static void main(String [] args){
        Employee e1 = new Employee(1 , "Shubham" , "Email");
        Employee e2 = new Employee(1 , "Shubham" , "Email");

        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
    }
}
