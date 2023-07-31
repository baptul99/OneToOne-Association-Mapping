package PersonAndPancard;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {

	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Person p=new Person();
		p.setEmail("abcd@gmail.com");
		p.setName("Gonesh");
		p.setPhone(78945625);
		
		
		PanCard pc= new PanCard();
		pc.setPerson(p);
        pc.setCity("Kolkata");
        pc.setCountry("INDIA");
        pc.setDob(LocalDate.parse("1997-06-19"));
        pc.setNumber(12345);
        pc.setPincode(71261);
        pc.setState("West Bengal");
        
        p.setPcard(pc);;
        manager.persist(p);
        transaction.begin();
        transaction.commit();
		
		
		
	}

}
