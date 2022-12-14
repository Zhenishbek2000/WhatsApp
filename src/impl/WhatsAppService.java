package impl;

import classes.Person;
import classes.WhatsApp;

import java.util.List;
import java.util.logging.Level;

public interface WhatsAppService {

    String downloadWhatsapp(List<Person> people, List<WhatsApp> users);
    String createContact (WhatsApp user,List<WhatsApp>users);
    String status(WhatsApp user);
    List<WhatsApp> getAllWhatsappProfiles(List<WhatsApp> users);
    String addContact(List<WhatsApp>users,WhatsApp whatsApp);
    String getMessage(List<WhatsApp>users,WhatsApp myUser);



}
