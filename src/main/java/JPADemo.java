import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPADemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

	  
	  
	  
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("nagoor");
	  
	  EntityManager em=emf.createEntityManager();
	  
	  em.getTransaction().begin();
	  
	  List<Object[]> al = em.createNativeQuery("SELECT * FROM Bank" ).getResultList();

			for(Object[] bank : al) {
				Bank ban=em.find(Bank.class, bank[0]);
			    System.out.println(ban);
			}
						  
	  em.getTransaction().commit();
  }
}
