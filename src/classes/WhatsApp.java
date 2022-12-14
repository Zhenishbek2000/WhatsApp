package classes;

import enums.Intelligence;

import java.util.ArrayList;
import java.util.List;

public class WhatsApp {
    private String phoneNumber;
    private String password;
    private String userName;
    private Intelligence intelligence = Intelligence.Я_ИСПОЛЬЗУЮ_ВАТСАП;

    private List<Contact> contacts = new ArrayList<>();

    public WhatsApp() {
    }

    public WhatsApp(String phoneNumber, String password, String userName) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
    }

    public WhatsApp(String phoneNumber, String userName) {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Intelligence getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Intelligence intelligence) {
        this.intelligence = intelligence;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", intelligence=" + intelligence +
                ", contacts=" + contacts +
                '}';
    }
}
