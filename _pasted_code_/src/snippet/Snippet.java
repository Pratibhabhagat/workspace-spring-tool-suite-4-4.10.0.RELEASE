package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD//EN"
	"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
	
	<hibernate-configuration>
		<session-factory>
			<property name="connection.url">jdbc:postgresql://localhost:5432/dvdrental</property> <!-- BD Mane -->
			<property name="connection.driver_class">org.postgresql.Driver</property> <!-- DB Driver -->
			<property name="connection.username">postgres</property> <!-- DB User -->
			<property name="connection.password">root</property> <!-- DB Password -->
	
			<!-- Enable Hibernate's automatic session context management -->
			<property name="current_session_context_class">thread</property>
			<property name="hibernate.hbm2ddl.auto">update</property>
			<property name="hibernate.dialect">org.hibernate.dialect.DerbyTenSevenDialect</property>
			<property name="hibernate.show_sql">true</property>
			<property name="hibernate.format_sql">true</property>
			<mapping class="com.deloitte.demo.Employee"></mapping>
		</session-factory>
	</hibernate-configuration>
	
	
}

