interface MessageService{
    public void SendMessage(String Message, String Recipient);
    public void ReceiveMessage(String Message, String Sender);
}

class EmailService implements MessageService{
    String EmailSubject;
    String AttachedFile;

    EmailService(String EmailSubject, String AttachedFile){
        this.EmailSubject = EmailSubject;
        this.AttachedFile = AttachedFile;
    }
    public void SendMessage(String Message, String Recipient){
        System.out.println("Email sent to " + Recipient + " with subject: " + EmailSubject);
        System.out.println("Message: " + Message);
        System.out.println("File attached: " + AttachedFile);
    }

    public void ReceiveMessage(String Message, String Sender){
        System.out.println("Email received from " + Sender);
        System.out.println("Message: " + Message);
    }
}

class SmsService implements MessageService{
    public void SendMessage(String Message, String Recipient){
        System.out.println("SMS sent to " + Recipient);
        System.out.println("Message: " + Message);
    }

    public void ReceiveMessage(String Message, String Sender){
        System.out.println("SMS received from " + Sender);
        System.out.println("Message: " + Message);
    }
}

class MainMessage{
    public static void main(String[] args) {
        EmailService EmSer = new EmailService("Some Agenda", "Some.pdf");
        SmsService SmSer = new SmsService();
        EmSer.SendMessage("find attached meeting agenda.", "Divyanshi");
        EmSer.ReceiveMessage("Hi, this is the meeting agenda.", "Jangid");

        SmSer.SendMessage("Don't forget about the meeting tomorrow!", "Divyanshi");
        SmSer.ReceiveMessage("Reminder: Meeting tomorrow at 10 AM.", "Jangid");
    }
}