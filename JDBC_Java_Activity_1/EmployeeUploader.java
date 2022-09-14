package Lab_Session_8th_Sep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeUploader {
	public static void main(String ...args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Press 1 to enter data in Department table..");
		System.out.println("Press 2 to enter data in Employee table..");
		System.out.println("Press 3 to retrieve employee details..");
		System.out.println("Press 4 to calculate PF");
		int c = Integer.parseInt(br.readLine());
		if(c==1) {
			storeDepartmentDetails();
		}
		else if(c==2) {
			storeEmployeeDetails();
		}
		else if(c==3) {
			BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee ID:- ");
			long eID = Long.parseLong(br.readLine());
			retrieveEmployeeDetails(eID);
		}
		else if(c==4) {
			calculatePF();
		}

	}
	public static void storeDepartmentDetails() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
			// connection driver manager
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "SAYANdas1@");
			Statement st = conn.createStatement(); // create statement
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Department ID:- ");
			long dID = Long.parseLong(br.readLine());
			System.out.println("Enter Department Name:- ");
			String dName = br.readLine();
			System.out.println("Enter Department Head:- ");
			String dHead = br.readLine();
			System.out.println("Enter Department Descrition:- ");
			String dDes = br.readLine();

			PreparedStatement pst = conn.prepareStatement("insert into Department values (?,?,?,?)");
			pst.setLong(1, dID);
			pst.setString(2, dName);
			pst.setString(3, dHead);
			pst.setString(4, dDes);
			pst.execute();

			System.out.println("Department Data inserted successfully...");
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void storeEmployeeDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
			// connection driver manager
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "SAYANdas1@");
			Statement st = conn.createStatement(); // create statement
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee ID:- ");
			long eID = Long.parseLong(br.readLine());
			System.out.println("Enter Employee Name:- ");
			String eName = br.readLine();
			System.out.println("Enter Employee Address:- ");
			String eAdd = br.readLine();
			System.out.println("Enter Employee Salary:- ");
			double eSalary = Double.parseDouble(br.readLine());
			System.out.println("Enter Employee_Contact_No:- ");
			long eCont = Long.parseLong(br.readLine());
			System.out.println("Enter Department ID:- ");
			long dID = Long.parseLong(br.readLine());

			PreparedStatement pst = conn.prepareStatement("insert into Employee values (?,?,?,?,?,?)");
			pst.setLong(1, eID);
			pst.setString(2, eName);
			pst.setString(3, eAdd);
			pst.setDouble(4, eSalary);
			pst.setLong(5, eCont);
			pst.setLong(6, dID);
			pst.execute();

			System.out.println("Employee Data inserted successfully...");
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void retrieveEmployeeDetails(long eID) {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
			// connection driver manager
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "SAYANdas1@");
			Statement st = conn.createStatement(); // create statement

			ResultSet set1 = st.executeQuery("select Employee_ID,Employee_Name,Employee_Contact_No,"
					+ "Employee_Address,Department_Name,"
					+ "Department_Head from Department left join Employee on Department.Department_ID = Employee.Department_ID where Employee_ID="+eID);
			while(set1.next()) {
				long a = set1.getLong(1);
				String b = set1.getString(2);
				long c = set1.getLong(3);
				String d = set1.getString(4);
				String e = set1.getString(5);
				String f = set1.getString(6);


				System.out.println("Employee ID: " + a);
				System.out.println("Employee Name: " + b);
				System.out.println("Employee Contact No: " + c);
				System.out.println("Employee Address: " + d);
				System.out.println("Department Name: " + e);
				System.out.println("Department Head: " + f);

			}
		} catch(Exception e) {

		}
	}
	
	public static void calculatePF() {
		 try {
			 
			 System.out.println("CALCULATING PF");
			 Class.forName("com.mysql.cj.jdbc.Driver"); // register driver
				// connection driver manager
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "SAYANdas1@");
				Statement stm=conn.createStatement();//creating statement
				BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Employee ID:- ");
				long Employee_id = Long.parseLong(brr.readLine());

				ResultSet rs=stm.executeQuery("select * from Employee where Employee_id="+Employee_id);
				while(rs.next()) {
					System.out.println("Employee_salary:"+rs.getLong(4));
					if(rs.getDouble(4)>1000 && rs.getDouble(4)<10000) {
			System.out.println("PF Ammount is:"+(rs.getDouble(4)*5/100));
					}
					if(rs.getDouble(4)>10000 && rs.getDouble(4)<100000) {
						System.out.println("PF Ammount is:"+(rs.getDouble(4)*6/100));
								}
					if(rs.getDouble(4)>100000) {
						System.out.println("PF Ammount is:"+(rs.getDouble(4)*7/100));
								}
				}
				rs.close();

					}
					catch(Exception e) {
						System.out.println(e);
					}
	}

}
