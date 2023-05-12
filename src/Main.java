public class Main {
    public static void main(String[] args) {

        Employee worker1 = new Worker("Ivan", "Petrov", 1);
        Employee worker2 = new Worker("Egor", "Serov", 2);
        Employee worker3 = new Worker("Gleb", "Lapin", 3);
        Employee worker4 = new Worker("Tim", "Minin", 4);
        Employee trainee1 = new Trainee("Den", "Zimin", 1);

        Employee director1 = new Director("Pavel", "Nemov", 1);
        Employee director2 = new Director("Daniil", "Malko", 4);

        director1.addWorker(worker1);
        director1.addWorker(worker2);
        director1.addWorker(worker3);
        director2.addWorker(worker4);
        director1.addWorker(director2);

        worker1.addWorker(trainee1);

        Service service = new Service();
        service.find(director1,"Ivan");

        System.out.println(service.find(director1,"Ivan"));
    }
}