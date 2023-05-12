import java.util.Arrays;

public class Trainee extends Employee {
    public Trainee(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public void setProf() {
        this.prof = PROF.TRAINEE;
    }
    @Override
    public String toString() {
        return "Trainee{" +
                " prof=" + prof +
                ", salary=" + getSalari()+
                " employees=" + Arrays.toString(employees) +
                '}';
    }
}

