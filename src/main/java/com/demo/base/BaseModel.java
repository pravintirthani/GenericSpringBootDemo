package com.demo.base;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
@SuppressWarnings("serial")
public class BaseModel implements Serializable {
	
	
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Basic(optional = false)
    private long basicId;

	public long getBasicId() {
		return basicId;
	}

	public void setBasicId(long basicId) {
		this.basicId = basicId;
	}

	
	
}