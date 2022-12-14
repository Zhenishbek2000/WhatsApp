package classes;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String phoneNumber;
    private String contactName;
    private List<String> Message = new ArrayList<>();

    public Contact(String phoneNumber, String contactName) {
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public List<String> getMessage() {
        return Message;
    }

    public void setMessage(List<String> message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", contactName='" + contactName + '\'' +
                ", Message=" + Message +
                '}';
    }
}
