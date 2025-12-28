# equals() in Java

## Purpose
- Compares **logical equality** of objects
- `==` compares memory references, not content

## Usage

```java
Employee e1 = new Employee(1, "Shubham", "shubham@mail.com");
Employee e2 = new Employee(1, "Shubham", "shubham@mail.com");

System.out.println(e1 == e2);       // false
System.out.println(e1.equals(e2));  // false initially

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Employee)) return false;
    Employee other = (Employee) obj;
    return this.id == other.id;
}
