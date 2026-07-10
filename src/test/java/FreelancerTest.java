import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FreelancerTest {
    @Test
    void shouldReturnCorrectPayment() {
        Freelancer freelancer = new Freelancer(50, 10);
        double payment = freelancer.calculatePayment();
        assertThat(payment).isEqualTo(500);
    }
    @Test
    void shouldReturnZeroWhenHoursIsZero() {
        Freelancer freelancer = new Freelancer(50, 0);
        double payment = freelancer.calculatePayment();
        assertThat(payment).isEqualTo(0);
    }
}
