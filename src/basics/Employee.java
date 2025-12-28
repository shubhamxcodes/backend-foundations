package basics;

public class Employee {
    int id;
    String name;
    String email;
    public Employee(int id , String name , String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
