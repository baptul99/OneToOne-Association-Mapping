package OneToOne;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerosnAndCard 
{
public static void main(String[] args)
{
	EntityManager manager=Persistence.createEntityManagerFactory("devb").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Person p=new Person();
	p.setPhone(99999);
	p.setEmail("baptul@gmail.com");
	p.setName("Baptul");
	
	
	AadharCard card=new AadharCard();
	card.setNumber(456555666L);
	card.setPincode(712611);
	card.setCity("kolkata");
	card.setDob(LocalDate.parse("1996-05-15"));
	card.setPerson(p);
	
	p.setCard(card);
	manager.persist(p);
	transaction.begin();
	transaction.commit();

}
}
