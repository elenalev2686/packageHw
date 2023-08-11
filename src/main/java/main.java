import ru.netology.packagehw.services.vacationService;

public class main {
    public main() {

    }

    public static void main(String[] args) {
        vacationService service = new vacationService();
        int count = service.calculate(0, 100000, 60000, 0);
             System.out.println(" Количество месяцев отдыха " + service.calculate(0, 100000, 60000, 0));
    }
}