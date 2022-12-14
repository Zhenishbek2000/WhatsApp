package impl;

import classes.Contact;
import classes.Person;
import classes.WhatsApp;
import enums.Intelligence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatsAppImpl implements  WhatsAppService{
    List<WhatsApp> whatsAppList=new ArrayList<>();


    @Override
    public String downloadWhatsapp(List<Person> people, List<WhatsApp> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write phone number: ");
        String phoneNumber = scanner.nextLine();
        String res = "";
        for (Person person : people) {
            if (phoneNumber.trim().equals(person.getPhoneNumber())) {
                System.out.print("Create password: ");
                String password = scanner.nextLine();
                System.out.print("Write user name: ");
                String userName = scanner.nextLine();
                Person per = null;
                for (Person p : people) {
                    if (phoneNumber.trim().toLowerCase().equals(p.getPhoneNumber().trim().toLowerCase())) {
                        per = p;
                        res = "──▄▄█▀▀▀▀▀█▄▄──\n" +
                                "▄█▀░░▄▄░░░░░▀█▄\n" +
                                "█░░░███░░░░░░░█\n" +
                                "█░░░██▄░░░░░░░█\n" +
                                "█░░░░▀██▄░██░░█\n" +
                                "█░░░░░░▀███▀░░█\n" +
                                "▀█▄░░░░░░░░░▄█▀\n" +
                                "─▄█░░░▄▄▄▄█▀▀──\n" +
                                "─█░░▄█▀────────\n" +
                                "─▀▀▀▀──WELCOME TO WHATSAPP";
                    }
                }
                users.add(new WhatsApp(phoneNumber, password, userName));
            }
        }
        if (res.equals("")){
            return "contact tabylgan jok";
        }else {
            return res;
        }
    }

    @Override
    public String createContact(WhatsApp user, List<WhatsApp> users) {
        Scanner scanner=new Scanner(System.in);
        return null;
    }

    @Override
    public String status(WhatsApp user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pishite novyi status: ");
        String statusScan= scanner.nextLine();
        user.setIntelligence(Intelligence.valueOf(statusScan.toUpperCase()));

        return "Status uspeshno izmenen!";
    }

    @Override
    public List<WhatsApp> getAllWhatsappProfiles(List<WhatsApp> users) {
        return users;
    }


    @Override
    public String addContact(List<WhatsApp> users, WhatsApp whatsApp) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("write phoneNumber :");
        String phoneNumber = scanner.nextLine();
        for (WhatsApp user:users) {
            if (phoneNumber.trim().equals(user.getPhoneNumber())){
                System.out.println("Kontact tabyldy :"+user.getUserName());
                System.out.print("Sohranit (yes/no)");
                String trim = scanner.nextLine();
                if (trim.trim().toLowerCase().equals("yes")){
                    System.out.println("Contakt sohranen!");
                    whatsApp.getContacts().add(new Contact(phoneNumber, user.getUserName()));
                }
            }

        }
        return "";
    }

    @Override
    public String getMessage(List<WhatsApp> users, WhatsApp myUser) {
        Scanner scanner=new Scanner(System.in);
        String message="";
        System.out.println("Kogo budete pisat' ");
        String userScan=scanner.nextLine();
        for (Contact contact : myUser.getContacts()) {
            if (contact.getContactName().equals(userScan)){
                System.out.println("contact tabyldy: "+ contact.getContactName() + "\nMessage...");
                message = contact.getContactName() + ": " + scanner.nextLine();
                System.out.println("Otpravit (yes/no)?");
                String yesOrNo = scanner.nextLine();
                if(yesOrNo.equals("yes")){
                    contact.getMessage().add(message);
                    for (WhatsApp user : users) {
                        if (user.getContacts() != null){
                            for (Contact contact1 : user.getContacts()) {
                                if (contact1.getPhoneNumber().equals(myUser.getPhoneNumber())){
                                    for (Contact myContact :
                                            myUser.getContacts()) {
                                        if (user.getPhoneNumber().equals(myContact.getPhoneNumber()) && user.getPhoneNumber().equals(contact.getPhoneNumber())) {
                                            contact1.getMessage().add(message);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "";
    }


}
