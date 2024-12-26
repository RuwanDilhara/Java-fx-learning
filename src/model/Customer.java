package model;

public class Customer {
    private String id;
    private String name;
    private String address;
    private Integer age;
    private Double salary;
    private String contact;

    public Customer() {
    }

    public Customer( String id,String name,String address, int age, double salary ,String contact) {
        this.contact = contact;
        this.salary = salary;
        this.age = age;
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
