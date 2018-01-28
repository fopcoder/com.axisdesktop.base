package com.axisdesktop.base.db.entity;

import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SimpleEntity<ID> extends BaseEntityName<ID> {
	@Lob
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "description=" + description + ", " + super.toString();
	}

}
