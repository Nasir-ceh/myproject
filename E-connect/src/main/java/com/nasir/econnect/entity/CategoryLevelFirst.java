package com.nasir.econnect.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CategoryL1")
public class CategoryLevelFirst {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;

	@OneToMany(cascade = CascadeType.ALL)

	@JoinTable(name = "L1_L2_JOIN", joinColumns = {

			@JoinColumn(name = "L1_id") }, inverseJoinColumns = { @JoinColumn(name = "L2_id") })
	private List<CategoryLevelSecond> listCategoryLevelSecond;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CategoryLevelSecond> getListCategoryLevelSecond() {
		return listCategoryLevelSecond;
	}

	public void setListCategoryLevelSecond(List<CategoryLevelSecond> listCategoryLevelSecond) {
		this.listCategoryLevelSecond = listCategoryLevelSecond;
	}

}
