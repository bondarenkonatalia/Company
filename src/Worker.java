import java.util.Arrays;

public class Worker extends Employee {
    public Worker(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public void setProf() {
        this.prof = PROF.WORKER;
    }

    @Override
    public void addWorker(Employee employee) {
        if (employee.prof.equals(PROF.TRAINEE))
        super.addWorker(employee);
        else {
            System.out.println("Можно нанять только стажера");
        }
    }
    @Override
    public int getSalari() {
        if (employees==null) {return super.getSalari();
        } else {
            return super.getSalari() + (employees.length +50);
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                " prof=" + prof +
                ", salary=" + getSalari()+
                " employees=" + Arrays.toString(employees) +
                '}';
    }
}
