package org.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hospital.dto.Hospital;

public class HospitalDao {
	Hospital hospital = new Hospital();
	EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		manager.persist(hospital);
		transaction.begin();
		transaction.commit();
		return hospital;
	}
	
	public Hospital updateHospital(Hospital hospital) {
		manager.merge(hospital);
		transaction.begin();
		transaction.commit();
		return hospital;
	}
	
	public Hospital fetchHospital(int id ) {
		hospital = manager.find(Hospital.class, id);
		if(hospital!=null) {
			return hospital;
		}
		return null;
	}
	
	public void deleteHospital(int id) {
		fetchHospital(id);
		if(hospital!=null) {
			manager.remove(hospital);
			transaction.begin();
			transaction.commit();
			System.out.println("Deleted Successfully");
		}
		else {
			System.out.println("No Data found for this ID");
		}
	}
}
