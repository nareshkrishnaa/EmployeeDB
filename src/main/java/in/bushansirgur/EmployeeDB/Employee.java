package in.bushansirgur.EmployeeDB;



public class Employee {

    private Long id;

    private String name;

    private String location;

    private String department;

    public Employee(String name, String location, String department) {
        this.name = name;
        this.location = location;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
