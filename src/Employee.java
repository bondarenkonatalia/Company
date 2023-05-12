import java.util.Arrays;

public abstract class Employee extends Person {

    private int exp;
    protected PROF prof;
    private final int basic = 1000;
    Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void addWorker(Employee employee){
        if (employees == null){
            employees = new Employee[1];
            employees[0] = employee;
        }else {
            employees = Arrays.copyOf(employees, employees.length +1);
            employees[employees.length -1] = employee;
        }
    }

    public Employee(String name, String surname, int exp) {
        super(name, surname);
        this.exp = exp;
        setProf();
    }
    public int getSalari(){
        return basic * prof.getKoef() * exp;
    }
    public abstract void setProf();

    @Override
    public String toString() {
        return "Employee{" +
                "name" + name +
                ", surname" + surname +
                ", exp=" + exp +
                ", prof=" + prof +
                ", salary=" + getSalari() +
                '}';
    }
}
