import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPADemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

	  
	  Bank bank=new Bank();
	  
	  
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("nagoor");
	  
	  EntityManager em=emf.createEntityManager();
	  
	  em.getTransaction().begin();
	  
	  bank=em.find(Bank.class, 523315);
	  
	  System.out.println(bank);
			  
	  em.getTransaction().commit();
  }
}
