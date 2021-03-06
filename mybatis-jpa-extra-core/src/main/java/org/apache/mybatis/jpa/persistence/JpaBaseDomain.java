package org.apache.mybatis.jpa.persistence;

import java.io.Serializable;
import java.util.UUID;

/**
 * BaseDomain for Database Table domain
 * 
 * @author Crystal.sea
 * 
 */
public class JpaBaseDomain extends JpaPagination implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6290127045507211154L;
	
	public String generateId() {
		return UUID.randomUUID().toString().toLowerCase();
	}
}
