package org.hospital.controller;

import java.util.Scanner;

import org.hospital.dao.HospitalDao;
import org.hospital.dto.Hospital;

public class HopitalController {
	static HospitalDao dao = new HospitalDao();
	static Hospital hospital = new Hospital();
	static Scanner sc = new Scanner(System.in);
	public static void takeInput() {
		System.out.println("Enter Hospital :  Name\n Founder\n Year of Establishment\n GST");
		String name = sc.next();
		String founder = sc.next();
		int yOEst = sc.nextInt();
		double gst = sc.nextDouble();
		
		hospital.setName(name);
		hospital.setFounder(founder);
		hospital.setyOEst(yOEst);
		hospital.setGst(gst);
		
	}
	public static void main(String[] args) {
	
		System.out.println("Select your choice by entering the respective number");
		System.out.println("1.Add Hospital Details");
		System.out.println("2.Update Hopital Details");
		System.out.println("3.Fetch Hospital Details");
		System.out.println("4.Delete Hospital ");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			takeInput();
			dao.saveHospital(hospital);
			System.out.println(hospital);
			break;
		case 2:
			System.out.println("Enter the Hospital ID");
			int id = sc.nextInt();
			Hospital fetchedHospital = dao.fetchHospital(id);
			if(fetchedHospital!=null) {
				System.out.println(fetchedHospital);
				hospital.setId(id);
				takeInput();
				dao.updateHospital(hospital);
			}
			else {
				System.out.println("No Data found for the ID "+id);
			}
			
			break;
		case 3:
			System.out.println("Enter the Hospital ID");
			id = sc.nextInt();			
			hospital = dao.fetchHospital(id);
			if(hospital!=null) {
				System.out.println(hospital);
			}
			else {
				System.out.println("No Data found for the ID "+id);
			}
			break;
		case 4:
			System.out.println("Enter the Hospital ID");
			id = sc.nextInt();	
			dao.deleteHospital(id);
			break;

		default:
			System.out.println("Please select a valid choice by entering the respective Number");
			break;
		}
	}
}
