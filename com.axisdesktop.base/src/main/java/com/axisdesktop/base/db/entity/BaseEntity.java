package com.axisdesktop.base.db.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.axisdesktop.base.utils.DateUtils;

@MappedSuperclass
public class BaseEntity<ID> {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private ID id;

	@CreationTimestamp
	@Column( updatable = false )
	@Temporal( TemporalType.TIMESTAMP )
	private Calendar created;

	@UpdateTimestamp
	@Temporal( TemporalType.TIMESTAMP )
	private Calendar modified;

	@PrePersist
	private void prePersist() {
		this.created = this.modified = Calendar.getInstance();
	}

	@PreUpdate
	private void preUpdate() {
		this.modified = Calendar.getInstance();
	}

	public ID getId() {
		return id;
	}

	public void setId( ID id ) {
		this.id = id;
	}

	public Calendar getCreated() {
		return created;
	}

	public void setCreated( Calendar created ) {
		this.created = created;
	}

	public Calendar getModified() {
		return modified;
	}

	public void setModified( Calendar modified ) {
		this.modified = modified;
	}

	@Override
	public String toString() {
		return "id=" + id + ", created=" + DateUtils.calendarToString( created ) + ", modified="
				+ DateUtils.calendarToString( modified );
	}

}
