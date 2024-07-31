public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier emailSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        System.out.println("Basic email notification:");
        emailNotifier.send("Hello via Email!");

        System.out.println("\nEmail and SMS notification:");
        emailAndSMSNotifier.send("Hello via Email and SMS!");

        System.out.println("\nEmail, SMS, and Slack notification:");
        emailSMSAndSlackNotifier.send("Hello via Email, SMS, and Slack!");
}
}