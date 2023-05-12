import java.util.Arrays;

public class Director extends Employee {

    public Director(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public void setProf() {this.prof = PROF.DIRECTOR; }

    @Override
    public int getSalari() {
        if (employees==null) {return super.getSalari();}
        else {
            return super.getSalari() + (employees.length*100);
        }
    }

    @Override
    public String toString() {
        return "Director{" +
                " prof=" + prof +
                ", salary=" + getSalari()+
                " employees=" + Arrays.toString(employees) +
                '}';
    }
}
