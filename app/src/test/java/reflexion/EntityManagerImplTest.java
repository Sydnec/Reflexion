/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package reflexion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;

class EntityManagerImplTest {
    @Test
    public void testFind() throws SQLException {
    
        Club club = new Club();
		club.setFabricant("un  nom");
		club.setPoids(10.3);

EntityManagerImpl em = new EntityManagerImpl();
	Club trouve = em.<Club> find(Club.class, club.getId());
	Assertions.assertEquals(club.getFabricant(), trouve.getFabricant());
    }

    @Test
	public void testPersistence() {
		Club club = new Club();
		club.setFabricant("un nom");
		club.setPoids(10.3);
		
		EntityManagerImpl em = new EntityManagerImpl();
		em.persist(club);
	}
}
