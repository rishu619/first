package library;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class Database {

	public static void main(String[] args) {

		try {
			
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		Session session = cluster.connect("library");

		
		session.execute("insert into fog(name) values('rohan')");
		session.execute("insert into fog(name) values('1rohan')");
		session.execute("insert into fog(name) values('Rohan')");
		session.execute("insert into fog(name) values('RoHan')");
		session.execute("insert into fog(name) values('ROhan')");
		//session.execute("alter table fog add rollno int");
		session.execute("update fog set rollno=1 where name='suraj'");
		//session.execute("update fog set name='alifia' where rollno=2");
		 ResultSet result = session.execute("select * from fog");

		 for(Row row:result)
		 {
		 System.out.println(row.getString("name")+" "+row.getInt("rollno"));
		 }
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
