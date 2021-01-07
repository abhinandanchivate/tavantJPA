package com.tavant.springboot.utils;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class TavantPhysicalNamingStrategy extends PhysicalNamingStrategyStandardImpl {

	 public static final String CAMEL_CASE_REGEX = "([a-z]+)([A-Z]+)";
	 
	    public static final String SNAKE_CASE_PATTERN = "$1\\_$2";
	    
	    @Override
	    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
	    	// TODO Auto-generated method stub
	    	return formatIdentifier(name);
	    }
	
//	@Override
//	public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
//		// TODO Auto-generated method stub
//		
//		// every table name should end with _tbl
//		String newName= name.getText().concat("_tbl");
//		
//		return Identifier.toIdentifier(newName);
//	}

	

	private Identifier formatIdentifier(Identifier identifier) {
		
		
		if(identifier!=null) {
			String name = identifier.getText();
			
			String formattedName = name.replaceAll(CAMEL_CASE_REGEX, SNAKE_CASE_PATTERN).toLowerCase();
			
			return !formattedName.equals(name)?Identifier.toIdentifier(formattedName,identifier.isQuoted()):identifier;
		}
		return null;
	}
}
