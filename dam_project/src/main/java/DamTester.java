import DAO.DamDAO;
import DAO.DamDAOimpl;
import Entity.DamEntity;

public class DamTester {
	public static void main(String[] args) {
	/*	DamEntity entity = new DamEntity();
		entity.setId(3);
		entity.setName("Srs");
		entity.setPlace("hyderabad");
		entity.setDepth(72.45);
		
		
		DamDAO dao = new DamDAOimpl();
		dao.save(entity);
		
		
		System.out.println("Data Stored"); */
		/*DamDAO getById = new DamDAOimpl();
	DamEntity entity = getById.Retrive(2);
		System.out.println(entity);
		System.out.println("You Got Result,Now Give me Party..");
	}*/
DamDAO entity2 = new DamDAOimpl();
	entity2.UpdateByName("RakshithG",1);
	System.out.println("successfully updated"); 
	
	
	/*DamDAO entity3 = new DamDAOimpl();
	entity3.DeleteById(2); */
}
}
