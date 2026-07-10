import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PayrollServiceTest {

    @Mock
    private NotificationService notificationService;

    @Test
    void shouldSendNotificationAfterPayment() {
        //Arrange
        PayrollService payrollService = new PayrollService(notificationService);
        Employee employee = new Employee(3000);

        //Act
        payrollService.processPayment(employee);

        //Assert
        verify(notificationService).send("Wypłacono: 3000.0");
    }


    @Test
    void shouldSendNotificationWithFreelancerPayment() {
        // Arrange: PayrollService (ten sam mock), Freelancer zamiast Employee
        PayrollService payrollService = new PayrollService(notificationService);
        Freelancer freelancer = new Freelancer(50, 20);

        // Act: processPayment
        payrollService.processPayment(freelancer);

        // Assert: verify z odpowiednią kwotą
        verify(notificationService).send("Wypłacono: 1000.0");
    }


}
