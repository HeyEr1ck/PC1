package pc1;

public class Customer {

    public static void main(String[] args) {
    }
    private String DNI;
    private String name;
    private String surname;
    private String address;
    private int age;

    public Customer() {
    }

    public Customer(String DNI, String name, String surname) {
        this.DNI = DNI;
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Customer{" + "DNI='" + DNI + '\'' + ", name='" + name + '\'' +
                ", surname='" + surname + '\'' + ", address='" + address + '\'' +
                ", age=" + age + '}';
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

