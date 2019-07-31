package com.nasir.econnect.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class CategoryMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "MFJOIN", joinColumns = {
			@JoinColumn(name = "mid") }, inverseJoinColumns = { @JoinColumn(name = "fid") })
	private List<CategoryLevelFirst> categoryLevelFirstList;

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

	public List<CategoryLevelFirst> getCategoryLevelFirstList() {
		return categoryLevelFirstList;
	}

	public void setCategoryLevelFirstList(List<CategoryLevelFirst> categoryLevelFirstList) {
		this.categoryLevelFirstList = categoryLevelFirstList;
	}
	

}
