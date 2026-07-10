import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {
    @Test
    void shouldReturnCorrectSalary() {
        Employee employee = new Employee(1000);
        double salary = employee.calculatePayment();
        assertThat(salary).isEqualTo(1000);
    }
}
