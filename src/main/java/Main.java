import ru.netology.packagehw.services.VacationService;

public class Main {
    public static void main(String[] args) {
        int income = 10000;
        int expense = 3000;
        int threshold = 20000;
        VacationService service = new VacationService();
        int count = service.calculate(10000, 3000, 0, 20000);
             System.out.println(" Количество месяцев отдыха " + service.calculate(10000, 3000, 0, 20000));
    }
}