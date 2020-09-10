import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Test {
	
	public static String time (String time) {
		
		
		SimpleDateFormat dateFormat=new SimpleDateFormat(" k:mm E d-M-yyyy ");
		
		Calendar calendar = new GregorianCalendar();
	
		calendar.set(Calendar.HOUR_OF_DAY, 8);
		calendar.set(Calendar.MINUTE, 0);
		calendar.add(Calendar.DATE,2);
		
		if ((calendar.get(Calendar.HOUR_OF_DAY) > 19)) {
			calendar.add(Calendar.DATE, 1);
			calendar.set(Calendar.HOUR_OF_DAY, 8);
		}
		if ((calendar.get(Calendar.DAY_OF_WEEK) == 6) && (calendar.get(Calendar.HOUR_OF_DAY) > 19)) {
			calendar.add(Calendar.DATE, 3);
		}
		if (calendar.get(Calendar.DAY_OF_WEEK) == 7) {
			calendar.add(Calendar.DATE, 2);
		}
		if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
			calendar.add(Calendar.DATE, 1);
		}
		
		return time;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
//		System.out.println("------------------Strings------------------");
//		
//		String test1="Some one;new";
//		String test2="Some";
//		
//		System.out.println(test1.concat(" +more")); // adds more to the string
//		System.out.println(test1.charAt(3)); // returns the character at possition
//		System.out.println(test1.contains("e")); // returns boolean condition
//		System.out.println(test1.indexOf(";")+1); // returns index if specific char
//		System.out.println(test1.substring(9)); // prints string from specific index
//		System.out.println(test1.toLowerCase()); // turns string to lower case
//		System.out.println(test1.toUpperCase()); // turs string all upper case 
//		System.out.println(test1.replace("e", "T")); // replaces strings 
//		System.out.println(test1.equalsIgnoreCase(test2)); // compare strings
//		System.out.println(test1.trim()+"one");
//		
//		
//		System.out.println("------------------ArrayList------------------");
//		
//		ArrayList testArrayList = new ArrayList(); // none generic ArrayList
//		ArrayList <String> test2ArrayList = new ArrayList<String>(); // generic ArrayList
//		
//		testArrayList.add("Some"); // adding a String elements
//		testArrayList.add("23");  // adds a String  element
//		testArrayList.add(false); // add a boolean element
//		testArrayList.add(-29); // add an integer element
//		testArrayList.add(76+11); //add an integer element
//		testArrayList.remove("23");// removing a String elements
//		testArrayList.set(1,true);// changing the boolean elements
//		testArrayList.add('A');
//		//bloodBin.clear(); // clear the array
//		
//		for (int i=1;i<6;i++) {
//			testArrayList.add(i);
//		}
//		
//		//reading from list:
//		
//		System.out.println("Reading with a normal for loop ");
//		for (int i=0;i<testArrayList.size();i++) {
//			System.out.print(testArrayList.get(i)+" ");
//		}
//		
//		System.out.println("\nWriting in a generic list with an enhanced for loop ");	
//		test2ArrayList.add("Some1");
//		test2ArrayList.add("Some2");
//		test2ArrayList.add("Some3");
//		System.out.println(test2ArrayList);
//		for(String s: test2ArrayList) {
//			System.out.println("S is "+s);
//			
//		}
//		
//		
//			
//
//		
//		
//		System.out.println("Array List Elements "+testArrayList);
//		System.out.println("Array List Size "+testArrayList.size());
//		System.out.println("Get element "+testArrayList.get(3));
//		System.out.println("--------------------------------------------------");
//		
//		ArrayList <Integer> test3 = new ArrayList<Integer>();
//		
//		test3.add(1);
//		test3.add(2);
//		test3.add(3);
//		test3.add(4);
//		test3.add(5);
//		test3.add(6);
//		test3.add(7);
//		test3.add(8);
//		test3.add(9);
//		test3.add(10);
//		test3.add(11);
//		test3.add(12);
//		test3.add(13);
//		test3.add(14);
//		test3.add(15);
//		
//		ArrayList <Integer> test4 = new ArrayList<Integer>();
//		test4.add(1);
//		test4.add(2);
//		test4.add(3);
//		test4.add(4);
//		test4.add(5);
//		test4.add(6);
//		test4.add(7);
//		test4.add(8);
//		test4.add(9);
//		test4.add(10);
//		
//		ArrayList <Integer> test5 = new ArrayList<Integer>();
//		
//		ArrayList <Integer> test6 = new ArrayList<Integer>();
//		
//		System.out.println("Test 3 Size "+test3.size());
//		System.out.println("Test 4 Size "+test4.size());
//		System.out.println("Test 5 Size "+test5.size());
//		System.out.println("Test 6 Size "+test6.size());
//		
//		while (test3.size() != 0) {
//			int index=0;
//			test5.add(index);
//			test3.remove(index);
//			System.out.println("hello");
//		}
		
		
		
//		for (int i=0;i<test3.size();i++) {
//			System.out.println(test3);
//			int a =test3.get(i);
//			test5.add(a);
//			test3.remove(i);
//			i=0;
//			
//		}
//		
//		System.out.println("Test 3 Size "+test3.size());
//		System.out.println("Test 4 Size "+test4.size());
//		System.out.println("Test 5 Size "+test5.size());
//		System.out.println("Test 6 Size "+test6.size());
	
//		
//		
//		ArrayList <Integer> recListSorted = new ArrayList <Integer>();
//		recListSorted.add(0);
//		recListSorted.add(11);
//		recListSorted.add(2);
//		recListSorted.add(3);
//		recListSorted.add(4);
//		recListSorted.add(5);
//		recListSorted.add(6);
//		recListSorted.add(7);
//		recListSorted.add(8);
//		recListSorted.add(9);
//		
//		ArrayList <Integer> donListSorted = new ArrayList <Integer>();	
//		donListSorted.add(0);
//		donListSorted.add(1);
//		donListSorted.add(2);
//		donListSorted.add(3);
//		donListSorted.add(4);
//		donListSorted.add(5);
//		donListSorted.add(6);
//		donListSorted.add(7);
//		donListSorted.add(8);
//		donListSorted.add(9);
//
//
//		
//		
//
//		ArrayList <Integer> appointments = new ArrayList <Integer>();
//		ArrayList <Integer> overflow = new ArrayList <Integer>();
//		
//		System.out.println("recListSorted "+recListSorted);
//		System.out.println("donListSorted "+donListSorted);
//		System.out.println("appointments " + appointments);
//		System.out.println("Overflow "+overflow);
		
//		for (int i=0;i<rec.size();i++) {
//			System.out.println("I is "+i);
//			i=-1;
//			for (int j=0;j<don.size();j++) {
//				System.out.println(" J is "+j+" "+don.size());
//				if (rec.get(i+1).equals(don.get(j))){
//					sum.add(rec.get(i+1));
//					sum.add(don.get(j));
//					rec.remove(i+1);
//					don.remove(j);
//				} 
////				if (j == don.size()+1) {
////					overflow.add(rec.get(i+1));
////					rec.remove(i+1);
////					System.out.println("Not Found");
////				}
//				
//			}
////			System.out.println("Sys 1 "+overflow.add(rec.get(i+1)));
////			System.out.println("Sys 2 "+rec.remove(i+1));
//			
//		}
		
		
		
//		while ((rec.size()!=0)||(don.size()!=0)) {
//			int index1=0; // recipients
//			int count=0; // donors
//			while(count < don.size()) {
//				System.out.println("Index1 is "+index1+" Count is "+count+" "+"Don size is "+don.size());
//				if (rec.get(index1).equals(don.get(count))) {
//					sum.add(rec.get(index1));
//					sum.add(don.get(count));
//					rec.remove(index1);
//					don.remove(count);
//				}
//				
//				count++;
//			}
//			
//		}
		
//		
//		while ((recListSorted.size()!=0) && (donListSorted.size()!=0)) {
//			int i=0;
//			System.out.println("I is "+i);
//			for (int j=0;j<donListSorted.size();j++) {
//				System.out.println(" J is "+j+" "+"Don size "+donListSorted.size());
//				if (recListSorted.get(i).equals(donListSorted.get(j))){
//					appointments.add(recListSorted.get(i));
//					appointments.add(donListSorted.get(j));
//					recListSorted.remove(i);
//					donListSorted.remove(j);
//					break;
//				}
//				if (j+1==donListSorted.size()) {
//					overflow.add(recListSorted.get(i));
//					recListSorted.remove(i);
//				}
//				
//			}
//		}
//		
//		for (int i=0;i<overflow.size();i++) {
//			recListSorted.add(overflow.get(i));
//			if (i+1 == overflow.size()) {
//				overflow.clear();
//			}
//		}
//		
//		
//		
//		
//		System.out.println("-----------------");
//		System.out.println("recListSorted "+recListSorted);
//		System.out.println("donListSorted "+donListSorted);
//		System.out.println("appointments " + appointments);
//		System.out.println("Overflow "+overflow);
//		
		
//		boolean copabilityTable  [] [] = 
//				
//			{
//						/* O-	O+	  A-	A+	  B-	B+	 AB-	AB+	*/
//			/* O- */	{true ,false,false,false,false,false,false,false},
//			/*-----------------------------------------------------------*/
//			/* O+ */	{true ,true ,false,false,false,false,false,false},
//			/*-----------------------------------------------------------*/
//			/* A- */	{true ,false,true ,false,false,false,false,false},
//			/*-----------------------------------------------------------*/
//			/* A+ */	{true ,true ,true ,true ,false,false,false,false},
//			/*-----------------------------------------------------------*/
//			/* B- */	{true,false,false,false,true ,false,false,false},
//			/*-----------------------------------------------------------*/
//			/* B+ */	{true ,true ,false,false,true ,true ,false,false},
//			/*-----------------------------------------------------------*/
//			/* AB- */	{true ,false,true ,false,true ,false,true ,false},
//			/*-----------------------------------------------------------*/
//			/* AB+ */	{true, true, true, true, true, true , true, true}
//			/*-----------------------------------------------------------*/	
//			
//			};
//		
//		System.out.println(copabilityTable[1][7]);
//		
//		
//		
//		ArrayList <Integer> test7=new ArrayList <Integer>();
//		
//		test7.add(1);
//		test7.add(7);
//		test7.add(4);
//		test7.add(9);
//		test7.add(1);
//		test7.add(1);
//		test7.add(7);
//		test7.add(4);
//		test7.add(4);
//		test7.add(9);
//		test7.add(1);
//		
//		System.out.println("ArrayList7 "+test7);
//		
//		ArrayList <String> test8=new ArrayList <String>();
//		
//		test8.add("1");
//		test8.add("7");
//		test8.add("4");
//		test8.add("9");
//		test8.add("1");
//		test8.add("1");
//		test8.add("7");
//		test8.add("4");
//		test8.add("4");
//		test8.add("9");
//		test8.add("1");
//		
//		System.out.println("ArrayList8 "+test8);
//		
//		
//		for (int i = 0; i < test7.size(); i++) {
//			for (int j = 0; j < test7.size(); j++) {
//				int a = test7.get(i); //1
//				int b = test7.get(j); //2
//				String c = test8.get(i); //1
//				String d = test8.get(j); //2
//				if (test7.get(i) < test7.get(j)) {
//					test7.set(i, b); // i = j
//					test7.set(j, a); // j = i
//					test8.set(i, d); // i = j
//					test8.set(j, c); // j = i
//
//				}
//			}
//		}
//		
//		System.out.println("ArrayList7 "+test7);
//		System.out.println("ArrayList8 "+test8);
//		
	
//		File test = new File("test.txt");
//		FileWriter fileWriter = new FileWriter(test);
//		PrintWriter printWriter = new PrintWriter(fileWriter);
//		
//		double i=1;
//		while ( i<10) {
//			printWriter.println(i*i);
//			i++;
//		}
//		printWriter.close();
//		
		
		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		ArrayList <String> test10 = new ArrayList <String>();
//		
//		SimpleDateFormat dateFormat=new SimpleDateFormat(" k:mm E d-M-yyyy ");
//		
//		Calendar calendar = new GregorianCalendar();
//		String time = dateFormat.format(calendar.getTime());
//		
//
//		
//		
//
//
//		calendar.set(Calendar.HOUR_OF_DAY, 8);
//		calendar.set(Calendar.MINUTE, 0);
//		calendar.add(Calendar.DATE,2);
//		
//		System.out.println(dateFormat.format(calendar.getTime()));
//		System.out.println("-----------------------------------");
//		int count=0;
//		
//		for (int i = 0; i < 20; i++) {
//			
//			if (i%10==0) {
//				test10.add("Martin---");
//			}
//			
//			calendar.add(Calendar.HOUR_OF_DAY, 1);
//			test10.add("Jon");
//			test10.add(time(dateFormat.format(calendar.getTime())));
//			
//			// add a for loop to check if date is already booked 
//		}
//		
//		
//		
//			
//			for (int i = 0; i < 1; i++) {
//
//
//				if ((calendar.get(Calendar.HOUR_OF_DAY) > 19)) {
//					calendar.add(Calendar.DATE, 1);
//					calendar.set(Calendar.HOUR_OF_DAY, 8);
//				}
//				if ((calendar.get(Calendar.DAY_OF_WEEK) == 6) && (calendar.get(Calendar.HOUR_OF_DAY) > 19)) {
//					calendar.add(Calendar.DATE, 3);
//				}
//				if (calendar.get(Calendar.DAY_OF_WEEK) == 7) {
//					calendar.add(Calendar.DATE, 2);
//				}
//				if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
//					calendar.add(Calendar.DATE, 1);
//				}
//				
//				for (int j=test10.size(); j>0 ;j--) {
//					
//					test10.add("Martin---");
//					
//					if (test10.get(j) == "Martin---") {
//						
//
//						calendar.add(Calendar.DATE, 54);
//						
//						if ((calendar.get(Calendar.HOUR_OF_DAY) > 19)) {
//							calendar.add(Calendar.DATE, 1);
//							calendar.set(Calendar.HOUR_OF_DAY, 8);
//						}
//						if ((calendar.get(Calendar.DAY_OF_WEEK) == 6) && (calendar.get(Calendar.HOUR_OF_DAY) > 19)) {
//							calendar.add(Calendar.DATE, 3);
//						}
//						if (calendar.get(Calendar.DAY_OF_WEEK) == 7) {
//							calendar.add(Calendar.DATE, 2);
//						}
//						if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
//							calendar.add(Calendar.DATE, 1);
//						}
//						
//						System.out.println("DATE "+dateFormat.format(calendar.getTime()));
//						test10.add(dateFormat.format(calendar.getTime()));
//						calendar.add(Calendar.DATE, - 56);
//						System.out.println("DATE "+dateFormat.format(calendar.getTime()));
//						break;
//					}
//					
//					
//				}
//				
//				// add a for loop to check if date is already booked 
//			}
//			
//		
//		
//		
//			for (int i = 0; i < test10.size(); i++) {
//				System.out.println(test10.get(i));
//			}
//		
//		System.out.println("-----------------------------------");
//		System.out.println(time(dateFormat.format(calendar.getTime())));
//		System.out.println(time);
//		
		
        int n = 5; 
        
        // Here al is an array of arraylist having 
        // n number of rows.The number of columns on 
        // each row depends on the user. 
        // al[i].size() will give the size of the 
        // i'th row 
        ArrayList<String>[] al = new ArrayList[n]; 
  
        // initializing 
        for (int i = 0; i < n; i++) { 
            al[i] = new ArrayList<String>(); 
        } 
  
        // We can add any number of columns to each 
        // rows as per our wish 
        al[0].add("1");
        al[0].add("2");
        al[0].add("3");
        al[1].add("1");
        al[1].add("2");
        al[1].add("3");
        al[2].add("1"); 
        al[2].add("2"); 
        al[2].add("3"); 
        al[3].add("1");
        al[3].add("2"); 
        al[3].add("3"); 
        al[4].add("1"); 
        al[4].add("2"); 
        al[4].add("3");
  
//        for (int i = 0; i < al.length; i++) { 
//            for (int j = 0; j < al[i].size(); j=j) { 
//                System.out.print(al[i].get(j) + " "); 
//                al[i].remove(j);
//                break;
//            }
//            break;
//        } 
        
		for (int i = 0; i < al.length; i++) {

			if (al[i].size() != 0) {
				int array = i;
				int index = 0;
				while ((al[array].size() != 0)) {
					System.out.println("element " + al[array].get(index) + " ");
					al[array].remove(index);
					break;
				}
				break;
			}

		}
        
        
        
    
        System.out.println(al.length);
        System.out.println(al[0].size());
        System.out.println(al[0]);
        System.out.println(al[1]);
        System.out.println(al[2]);
        System.out.println(al[3]);
        System.out.println(al[4]);
        
        

        
        
    } 
		
		
		
	}

