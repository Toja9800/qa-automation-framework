public class PayrollService {
    private NotificationService notificationService;

    public PayrollService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processPayment(Payable payable) {
        double amount = payable.calculatePayment();
        notificationService.send("Wypłacono: " + amount);
    }
}
