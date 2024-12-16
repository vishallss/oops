

import java.util.*;
public class Assignment07<T> {
    ArrayList<T> list = new ArrayList<T>();
    public void assign(T local_array[], int n) {
        for (int i = 0; i < n; i++) {
            list.add(local_array[i]);
        }
    }
    public void display() {
        Iterator<T> itr = list.iterator();
        System.out.print("Input Given is as below : ");
        while (itr.hasNext()) {
            System.out.print("\n" + itr.next());
        }
    }
    public void check_palindrome() {
        String s, r;
        T temp;
        boolean flag = false;
        Iterator<T> itr = list.iterator();
        System.out.println("\nPalindrome Strings are : ");
        while (itr.hasNext()) {
            temp = itr.next();
            s = temp.toString();
            StringBuilder sr = new StringBuilder(s);
            r = sr.reverse().toString();
            if (s.equals(r)) {
                flag = true;
                System.out.println(temp);
            }
        }
        if (flag == false)
            System.out.println("\nPalindrome not found ");
    }
    public void even_odd() {
        int even = 0, odd = 0;
        Iterator<T> itr = list.iterator();
        T temp;
        String s;
        int i;
        while (itr.hasNext()) {
            temp = itr.next();
            s = temp.toString();
            i = Integer.parseInt(s);
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.print("\nEven numbers are : " + even);
        System.out.print("\nOdd numbers are :  " + odd);
    }
    public void chech_prime() {
        int prime = 0;
        boolean flag = false;
        Iterator<T> itr = list.iterator();
        T temp;
        String s;
        int i;
        while(itr.hasNext()){
            temp= itr.next();
            s=temp.toString();
            i=Integer.parseInt(s);
            int m=(i/2);
            for(int j=2;j<=m;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(i+" is a Prime number");
                prime++;
            }
            else
                System.out.println(i+" is not a Prime number");
        }
        System.out.println("Total prime numbers are "+prime);
    }
    public static void main(String[]args){
        int i,n=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many(String/Integer)elements you want : ");
        n=sc.nextInt();
        int ch;
        do {
            System.out.print("\n1.Integer\t2.String\t3.Exit\nChoose what do you want :");
            ch= sc.nextInt();
            switch (ch) {
                case 1:
                    Integer a[] = new Integer[n];
                    System.out.println("\nEnter elements : ");
                    for (i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                    }
                    Assignment07<Integer> int_obj = new Assignment07<Integer>();
                    int_obj.assign(a, n);
                    int_obj.display();
                    System.out.println();
                    System.out.println();
                    int_obj.chech_prime();
                    int_obj.even_odd();
                    System.out.println();
                    int_obj.check_palindrome();
                    break;
                case 2:
                    String b[] = new String[n];
                    System.out.println("\nEnter elements : ");
                    for (i = 0; i < n; i++) {
                        b[i] = sc.next();
                    }
                    Assignment07<String> str_obj = new Assignment07<String>();
                    str_obj.assign(b, n);
                    System.out.println();
                    str_obj.display();
                    System.out.println();
                    str_obj.check_palindrome();
                    break;
                default:
                    System.out.println("Wrong Choice !!!");
            }
        }while (ch<3);
        sc.close();
    }
}





