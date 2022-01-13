
   
package atm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class ATM2 {
public static void balance(int balance)
	{
	System.out.println("balance = "+balance);
	}
public static int transfer1(int customerid ,int balance,int x,int t)
{
		{
			System.out.println("transfering amount = "+ x + " from account " + customerid+ " to account " + t);
			balance(balance);
			System.out.println("Transfer successfull!");
		}
		return 0;


	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password ="root";
		    try {
		    	Connection connection =DriverManager.getConnection(url, username, password);
		    	Scanner s = new Scanner(System.in);
		    	System.out.println("enter account number:");
		    	int a = s.nextInt();
		    	int p = 0 ;
				String sql ="select Name,Accnt_No,Balance from atm_data where Accnt_No="+a;
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(sql);
				String sql2 = "select Balance from atm_data";
				Statement statement1 = connection.createStatement();
				ResultSet rs = statement1.executeQuery(sql2);
				rs.next();
				test p = new test();
				p.transfer1();
				ResultSet result1 = statement.executeQuery("select Balance from atm_data where"+a);
				int p = result1.getInt("balance");
				p=result.getInt("Balance");
				ResultSet result = statement.executeQuery(sql);
				ResultSet result = statement.executeQuery(sql);
				ResultSet result1= statement.executeUpdate(sql1);
				int count=0;
				int x = 0;
				int a = s.nextInt();
				while(result.next()) {
					String name = result.getString("name");
					int balance = result.getInt("balance");
					int Accnt_No = result.getInt("Accnt_No");
					}

				
					Scanner s = new Scanner(System.in);
					count++;