package org.hospital.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hospital")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String founder;
	@Column(nullable = false)
	private int yOEst;
	@Column(nullable = false)
	private double gst;

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", founder=" + founder + ", yOEst=" + yOEst + ", gst=" + gst
				+ "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the founder
	 */
	public String getFounder() {
		return founder;
	}

	/**
	 * @param founder the founder to set
	 */
	public void setFounder(String founder) {
		this.founder = founder;
	}

	/**
	 * @return the yOEst
	 */
	public int getyOEst() {
		return yOEst;
	}

	/**
	 * @param yOEst the yOEst to set
	 */
	public void setyOEst(int yOEst) {
		this.yOEst = yOEst;
	}

	/**
	 * @return the gst
	 */
	public double getGst() {
		return gst;
	}

	/**
	 * @param gst the gst to set
	 */
	public void setGst(double gst) {
		this.gst = gst;
	}

}
