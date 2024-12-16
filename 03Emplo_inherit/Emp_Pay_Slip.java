import java.util.Scanner;

class Employee {
    String Emp_name;
    String Emp_id;
    String Address;
    String Email_id;
    Long Mobile_no;
    Scanner s = new Scanner(System.in);

    public void Read() {
        System.out.println("Enter Name:");
        Emp_name = s.nextLine();
        System.out.println("Enter Employee Id:");
        Emp_id = s.nextLine();
        System.out.println("Enter Address:");
        Address = s.nextLine();
        System.out.println("Enter Email Id:");
        Email_id = s.nextLine();
        System.out.println("Enter Mobile No.:");
        Mobile_no = s.nextLong();
    }

    public void Display() {
        System.out.println("\n\n\t\t ******Employee Details****** ");
        System.out.println("Name: " + Emp_name);
        System.out.println("ID: " + Emp_id);
        System.out.println("Address: " + Address);
        System.out.println("Email Id: " + Email_id);
        System.out.println("Mobile No.: " + Mobile_no);
    }
}

// Class Programmer
class Programmer extends Employee {
    double BP, DA, HRA, PF, SCF;
    double Gross_sal, Net_sal;

    Programmer() {
        BP = 15000;
    }

    public void calc() {
        DA = 0.97 * BP;
        HRA = 0.10 * BP;
        PF = 0.12 * BP;
        SCF = 0.001 * BP;
        Gross_sal = BP + DA + HRA;
        Net_sal = Gross_sal - PF - SCF;
        System.out.println("\n\n\t\t ******Salary Details****** ");
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("Staff Club Fund: " + SCF);
        System.out.println("Gross Salary: " + Gross_sal);
        System.out.println("Net Salary: " + Net_sal);
    }
}

// Class Professor
class Professor extends Employee {
    double BP, DA, HRA, PF, SCF;
    double Gross_sal, Net_sal;

    Professor() {
        BP = 52000;
    }

    public void calc() {
        DA = 0.97 * BP;
        HRA = 0.10 * BP;
        PF = 0.12 * BP;
        SCF = 0.001 * BP;
        Gross_sal = BP + DA + HRA;
        Net_sal = Gross_sal - PF - SCF;
        System.out.println("\n\n\t\t ******Salary Details****** ");
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("Staff Club Fund: " + SCF);
        System.out.println("Gross Salary: " + Gross_sal);
        System.out.println("Net Salary: " + Net_sal);
    }
}

// Class AssistantProfessor
class AssistantProfessor extends Employee {
    double BP, DA, HRA, PF, SCF;
    double Gross_sal, Net_sal;

    AssistantProfessor() {
        BP = 46000;
    }

    public void calc() {
        DA = 0.97 * BP;
        HRA = 0.10 * BP;
        PF = 0.12 * BP;
        SCF = 0.001 * BP;
        Gross_sal = BP + DA + HRA;
        Net_sal = Gross_sal - PF - SCF;
        System.out.println("\n\n\t\t ******Salary Details****** ");
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("Staff Club Fund: " + SCF);
        System.out.println("Gross Salary: " + Gross_sal);
        System.out.println("Net Salary: " + Net_sal);
    }
}

// Class AssociateProfessor
class AssociateProfessor extends Employee {
    double BP, DA, HRA, PF, SCF;
    double Gross_sal, Net_sal;

    AssociateProfessor() {
        BP = 44000;
    }

    public void calc() {
        DA = 0.97 * BP;
        HRA = 0.10 * BP;
        PF = 0.12 * BP;
        SCF = 0.001 * BP;
        Gross_sal = BP + DA + HRA;
        Net_sal = Gross_sal - PF - SCF;
        System.out.println("\n\n\t\t ******Salary Details****** ");
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("Staff Club Fund: " + SCF);
        System.out.println("Gross Salary: " + Gross_sal);
        System.out.println("Net Salary: " + Net_sal);
    }
}

// Main Class
public class Emp_Pay_Slip {
    public static void main(String[] args) {
        int choice = 0;
        Programmer p = new Programmer();
        Professor prof = new Professor();
        AssistantProfessor ap = new AssistantProfessor();
        AssociateProfessor asp = new AssociateProfessor();
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("\n----------MENU----------");
            System.out.println("1. Programmer");
            System.out.println("2. Professor");
            System.out.println("3. Assistant Professor");
            System.out.println("4. Associate Professor");
            System.out.println("5. EXIT");
            System.out.println("Enter Your Choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    p.Read();
                    p.Display();
                    p.calc();
                    break;
                case 2:
                    prof.Read();
                    prof.Display();
                    prof.calc();
                    break;
                case 3:
                    ap.Read();
                    ap.Display();
                    ap.calc();
                    break;
                case 4:
                    asp.Read();
                    asp.Display();
                    asp.calc();
                    break;
                case 5:
                    System.out.println("\nExiting From Program!!!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        } while (choice != 5);
        s.close();
    }
}
