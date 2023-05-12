public class Service implements FindeInterface {

    @Override
    public boolean find(Employee employee, String name) {
        Employee[] employees = employee.getEmployees();
        for ( Employee empl : employees){
            String emplName = empl.name;
            if (emplName.equals(name)) {
                return true;
            }
        }return false;
    }
}
