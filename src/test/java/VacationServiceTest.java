import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.packagehw.services.VacationService;

public class VacationServiceTest {
    @ParameterizedTest
    //@CsvSource({
           // "3,0,10000,3000,20000"
          //  "2,0,100000,60000,150000"
   // })
    @CsvFileSource(files="src/test/resources/vacation.csv")
    public void shouldCalculate(int expected, int money, int income, int expense, int threshould) {
        VacationService service = new VacationService();

        //int expected = 3;
        //int actual = service.calculate(0, 10000, 3000, 20000);
       // Assertions.assertEquals(expected, actual);
    }
    //@Test
    //public void secondShouldCalculate() {
    //  vacationService service = new vacationService();
    // int expected = 2;
    // int actual = service.calculate(0, 100000, 60000, 150000);
    //Assertions.assertEquals(expected, actual);
    // }

}


