import java.io.*; 
public class EXP8 
{ 
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	public void addRecords() throws IOException 
	{ try{
		// Create or Modify a file for Database 
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("Data.txt",true))); 
		String studentname, address,Class,studentid; 
		int rollno; 
		float marks; 
		String s; 
		boolean addMore = false; 
		// Read Data 
		do 
		{ 
			System.out.print("\nEnter Student Name: "); 
			studentname = br.readLine(); 
			System.out.print("Student Id: "); 
			studentid = br.readLine(); 
			System.out.print("Roll no: "); 
			rollno = Integer.parseInt(br.readLine()); 
			System.out.print("Address: "); 
			address = br.readLine(); 
			System.out.print("Class: "); 
			Class = br.readLine(); 
			System.out.print("Marks : "); 
			marks = Float.parseFloat(br.readLine()); 
			// Print to File 
			pw.println(rollno+"\t "+studentid+"\t "+studentname+"\t "+address+"\t "+Class+"\t "+marks); 
System.out.print("\nRecords added successfully !\n\nDo you want to add more records ? (y/n) : "); 
			s = br.readLine(); 
			if(s.equalsIgnoreCase("y")) 
			{ 
			addMore = true; 
			System.out.println(); 
			} 
			else 
			addMore = false; 
		} 
		while(addMore); 
		pw.close(); 
		showMenu(); 
}
catch(IOException e)
{e.printStackTrace();
}
	} 
	public void readRecords() throws IOException 
	{ 
		try 
		{ 
			// Open the file 
			BufferedReader file = new BufferedReader(new FileReader("Data.txt")); 
			String name; 
			int i=1; 
			System.out.println("RollNo\t ID\t Name\tAddress\t Class\t Marks"); 
			// Read records from the file 
			while((name = file.readLine()) != null) 
			{ 
			System.out.println(name); 
			} 
			file.close(); 
			showMenu(); 
		} 
		catch(FileNotFoundException e) 
		{ 
		System.out.println("\nERROR : File not Found !!!"); 
		} 
	} //End of read reacord()
	public void searchRecords() throws IOException 
		{ 
		try 
		{ 
		// Open the file 
		BufferedReader file = new BufferedReader(new FileReader("Data.txt")); 
		String name; 
		int flag=0; 
		System.out.print("Enter an id of the student you want to search: "); 
		String searchname=br.readLine(); 
		// Read records from the file 
		while((name = file.readLine())!= null) 
		{ 
		String[] line = name.split(" "); 
		if(searchname.equalsIgnoreCase(line[1].trim())) 
		{ 
		System.out.println("Record found"); 
		System.out.println("RollNo\t ID\t Name\tAddress\t Class\t Marks");  
		System.out.println(name); 
		System.out.println(""); 
		flag=1; 
		break; 
		} 
		} 
		if(flag==0) 
		System.out.println("Record not found"); 
		file.close(); 
		showMenu(); 
		} 
		catch(FileNotFoundException e) 
		{ 
		System.out.println("\nERROR : File not Found !!!"); 
		} 
	} 
	public void deleteRecords() throws IOException 
	{ 
		try 
		{ 
		// Open the file 
		BufferedReader file1 = new BufferedReader(new FileReader("Data.txt")); 
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("Temp.txt",true))); 
		String name; 
		int flag=0; 
		System.out.print("Enter the ID of the student you want to delete: "); 
		String searchname=br.readLine(); 
		// Read records from the file 
		while((name = file1.readLine()) != null) 
		{ 
		String[] line = name.split(" "); 
		if(!searchname.equalsIgnoreCase(line[1].trim())) 
		{ 
		pw.println(name); 
		flag=0; 
		} 
		else 
		{ 
		System.out.println("Record found"); 
		flag=1; 
		} 
		} 
		file1.close(); 
		pw.close(); 
		File delName = new File("Data.txt"); 
		File oldName = new File("Temp.txt"); 
		File newName = new File("Data.txt"); 
		if(delName.delete()) 
		System.out.println("deleted successfully"); 
		else 
		System.out.println("Error"); 
		if (oldName.renameTo(newName)) 
		System.out.println("Renamed successfully"); 
		else 
		System.out.println("Error"); 
		showMenu(); 
		} 
		catch(FileNotFoundException e) 
		{ 
		System.out.println("\nERROR : File not Found !!!"); 
		} 
	} 
	public void updateRecords() throws IOException 
	{ 
		try 
		{ 
		// Open the file 
		BufferedReader file1 = new BufferedReader(new FileReader("Data.txt")); 
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Temp.txt",true))); 
		String name; 
		int flag=0; 
		System.out.print("Enter the ID of the student you want to update: "); 
		String searchname=br.readLine(); 
		// Read records from the file 
		while((name = file1.readLine()) != null) 
		{ 
		String[] line = name.split("\t"); 
		if(!searchname.equalsIgnoreCase(line[1].trim())) 
		{ 
		pw.println(name); 
		flag=0; 
		} 
		else 
		{ 
		System.out.println("Record found"); 
		System.out.println("What do you want to change/update\n1.Name\t2.Address  \t3.Marks");
		String chh=br.readLine();
		switch(chh) {
		case "1" :System.out.print("Enter updated name : ");
			String up_name=br.readLine();
line[2]=up_name; 
			pw.println(line[0]+"\t"+line[1]+"\t "+line[2]+"\t"+line[3]+"\t"+line[4]+"\t"+line[5]); 
			flag=1; 
			break;
		case "2" :System.out.print("Enter updated address : ");
			String up_add=br.readLine(); 
			pw.println(line[0]+"\t"+line[1]+"\t "+line[2]+"\t"+up_add+"\t"+line[4]+"\t"+line[5]); 
			flag=1;
			break;
		case "3" :System.out.print("Enter updated marks : ");
			String up_mark=br.readLine(); 
			pw.println(line[0]+"\t"+line[1]+"\t "+line[2]+"\t"+line[3]+"\t"+line[4]+"\t"+up_mark); 
			flag=1; 
		}
		
		} 
		} 
		file1.close(); 
		pw.close(); 
		File delName = new File("Data.txt"); 
		File oldName = new File("Temp.txt"); 
		File newName = new File("Data.txt"); 
		if(delName.delete()) 
		System.out.println("record updated successfully"); 
		else 
		System.out.println("Error"); 
		if (oldName.renameTo(newName)) 
		System.out.println("Renamed successfully"); 
		else 
		System.out.println("Error"); 
		showMenu(); 
		} 
		catch(FileNotFoundException e) 
		{ 
		System.out.println("\nERROR : File not Found !!!"); 
		} 
	} 
	public void clear(String filename) throws IOException 
	{ 
		// Create a blank file 
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename))); 
		pw.close(); 
		System.out.println("\nAll Records cleared successfully !"); 
		for(int i=0;i<999999999;i++); // Wait for some time 
		showMenu(); 
	} 
	public void showMenu() throws IOException 
	{ 
		System.out.println("--------------MENU--------------"); 
		System.out.print("1. Add Records\n2. Display Records\n3. Clear All Records\n4. Search Records"
				+ "\n5. Delete Records\n6. Update Records \n7. Exit\n\nEnter your choice : "); 
		int choice = Integer.parseInt(br.readLine()); 
		System.out.println(""); 
		switch(choice) { 
		case 1: 
		addRecords(); 
		break; 
		case 2: 
		readRecords(); 
		break; 
		case 3: 
		clear("st.txt"); 
		break; 
		case 4: 
		searchRecords(); 
		break; 
		case 5: 
		deleteRecords(); 
		break; 
		case 6: 
		updateRecords(); 
		break; 
		case 7: 
		System.exit(0); 
		break; 
		default: 
		System.out.println("\nInvalid Choice !"); 
		break; 
		} 
	} 
	public static void main(String args[]) throws IOException 
	{ 
		EXP8 call = new EXP8(); 
		call.showMenu(); 
	} 
}

