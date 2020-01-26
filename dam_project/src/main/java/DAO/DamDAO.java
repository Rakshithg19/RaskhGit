package DAO;

import Entity.DamEntity;

public interface DamDAO {
	 public void save(DamEntity entity);
	 
	 public DamEntity Retrive(int d_id);
	 public void UpdateByName(String d_name,int d_id);
	 public void DeleteById(int d_id);
}
