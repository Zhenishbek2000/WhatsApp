import classes.Person;
import classes.WhatsApp;
import enums.Country;
import enums.Gender;
import enums.Intelligence;
import impl.PersonImpl;
import impl.WhatsAppImpl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        List<Person>people=new ArrayList<>();
        List<WhatsApp>whatsApps=new ArrayList<>();
        PersonImpl person=new PersonImpl();

        WhatsAppImpl whatsAppImpl =new WhatsAppImpl();
        while (true){
            System.out.println("1 == sozdayt person");
            System.out.println("2 == Country");
            System.out.println("3 == Intelligence");
            System.out.println("4 == Gender ");
            System.out.println("5 == Videt' vseh lydey");
            System.out.println("6 == Sozdait WatsApp");
            System.out.println("7 == u kogo est' WatsApp");
            System.out.println("8 == voiti profile");
            int number= scanner.nextInt();
            switch (number) {
                case 2:
                    System.out.println("<<<<<<<<<<<Country>>>>>>>>>>>>>>>");
                    for (Country value : Country.values()) {
                        System.out.println(value);
                    }
                case 3:
                    System.out.println("<<<<<<Intelligence>>>>>>>>>>>");
                    for (Intelligence value : Intelligence.values()) {
                        System.out.println(value);
                    }
                    break;
                case 4:
                    System.out.println("<<<<<<<<Gender>>>>>>>>>>>");
                    for (Gender value : Gender.values()) {
                        System.out.println(value);
                    }
                    break;
                case 1:
                    System.out.print("ID :");
                    int id = scanner.nextInt();
                    System.out.print("Name :");
                    String name = scanner1.nextLine();
                    System.out.print("LastName :");
                    String lastName = scanner1.nextLine();
                    System.out.print("Data rojdenie :");
                    LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    System.out.print("Gender :");
                    String gender = scanner1.nextLine();
                    System.out.print("Country :");
                    String country = scanner1.nextLine();
                    System.out.print("Phone number :");
                    String phoneNumber = scanner1.nextLine();


                    System.out.println(person.createPerson(people, id, name, lastName, date, gender, country, phoneNumber));
                    break;
                case 5:
                    person.gerAllPerson(people).forEach(System.out::println);
                    break;
                case 6:
                    System.out.println(whatsAppImpl.downloadWhatsapp(people, whatsApps));
                    break;
                case 7:
                    whatsAppImpl.getAllWhatsappProfiles(whatsApps).forEach(System.out::println);
                    break;
                case 8:
                    System.out.println("Password: ");
                    String password = scanner1.nextLine();
                    for (WhatsApp user : whatsApps) {
                        if (password.trim().equals(user.getPassword())) {
                            profile(whatsApps, user, whatsAppImpl);

                        }
                    }
                            break;
                }
            }
        }
    public static  void  profile(List<WhatsApp> whatsApps, WhatsApp user,WhatsAppImpl whatsApp){
            System.out.println("""
                    1.dobavit contact
                    2.izmenit status
                    3.message jazuu""");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println(whatsApp.addContact(whatsApps, user));
                    break;
                case 2:
                    System.out.println(whatsApp.status(user));
                    break;
                case 3:
                    user.getContacts().forEach(System.out::println);
                    System.out.println(whatsApp.getMessage(whatsApps, user));
                    break;
                default:
                    System.out.println("nepravilno veli password!!!");
            }
    }
}