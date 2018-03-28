package com.bridgelabz.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.Utility.LinkedList.Node;
import com.bridgelabz.Utility.OrderedLinkedList.Node1;

public  class Utility {
	static Scanner s;

//Default Constructor to Creating object of scanner
	public Utility() 
	{
		s=new Scanner(System.in);
    }

// To return String Input
	public static String inputString()
	{
			return s.next();
	}
//To return String Input Line
	public static String inputStringLine()
	{
			return s.nextLine();
	}

//To return String Input
	public static long inputlong()
	{
			return s.nextLong();
	}
//To return Integer input
	public static int inputInt()
	{
			return s.nextInt();
		
	}

//To return Double input
	public static double inputDouble()
	{
			return s.nextDouble();
		
	}
//To return Boolean input;
	public static boolean inputBoolean() 
	{
	return s.nextBoolean();	
	}

//To accept Array of int
	public static Integer[] ArrayInt(int n)
	{
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		return a;
	}
//To acccept Generic Array
	public static String[] ArrayString(int n)
	{
		String a[] = new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.next();
		}
		return a;
	}

//To Read File
	public static FileReader fileRead(String string) 
	{
		FileReader f = null;
		try {
			f = new FileReader(string);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		return f;	
	}

//To write into file
	public static FileWriter fileWrite(String string) 
	{
		FileWriter f = null;
		try 
		{
			f = new FileWriter(string);
		} 
		catch (IOException e) 
		{
			//
			e.printStackTrace();
		}
		return f;	
	}
	
//Method to replace username
	public static String replaceString(String username)
	{
		int len=username.length();
		String str="Hello <<username>>, How are you?";
		if(len>3)
		{
			return str.replace("<<username>>", username);
		}
		else 
			return "Please Enter More than Three Character";
	}

//Method to flip the coin and print the percentile
	public static void flipCoin(int n)
	{
		int tail=0;int head=0;
		float tailPer=0;
		float headPer=0;
		if(n>0)
		{
			for(int i=0;i<n;i++)
			{
				if(Math.random()<0.5)
				{
					tail++;
					//System.out.println("tail");
				}
				else
					head++;
			}
			tailPer=((float)tail/n)*100;
			headPer=((float)head/n)*100;
			System.out.println("Tail Percent is:"+tailPer);
			System.out.println("Head Percent is"+headPer);
		}
		
	}

//Method to check Leap Year
	public static boolean isLeapOrNot(int year) 
	{
		if(year%4==0 || year%400==0 && year%100!=0)
		{
			System.out.println("Is a Leap Year");
			return true;
		}
		else
		{
			System.out.println("Is not a Leap Year");
			return false;
		}
		
	}
	
//Method to find Harmonic Year
	public static float harmonicValue(int n) 
	{	
		float sum=0;
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				sum=sum+((float)1/i);
			}
		}
		return sum;
	}

//Method to find n prime factor
	public static void primeFactor(long n) 
	{
		for(long i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		if(n>1)
			System.out.println(n);
		else 
			System.out.println();
	}

//Method to find nth power of 2
	public static void powerOf2(int n) 
	{
		if(n>=0 && n<31)
		{
			int p=1;
			for(int i=0;i<=n;i++)
			{
				System.out.println("2^"+i+"="+p);
				p=2*p;
			}
		}
		
	}
	
//Method for gamblers
	public static void gambler(int stake,int goal,int times) {
		int win=0;
	
		for(int i=1;i<=times;i++)
		{	
			int money=stake;
			while(money>0 && money<goal)
			{
				if(Math.random()<0.5)
				{
					money++;
				}
				else
				{
					money--;
				}
				if(money==goal)
				{
					win++;
				}
			}
		}
		System.out.println("Times won:"+win);
		System.out.println("Percent of win:"+(win*100/times));
		System.out.println("Percent of loss:"+((times-win)*100/times));
	}
	
//Method for Distinct Coupon
	public static float random() 
	{
		return (float) Math.random()*9999;
	}
	public static void distinct(int n) 
	{
	boolean same= false;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			float value = random();
			for(int j=0;j<n;j++)
			{
				if(a[j]==value)
				{
					same=true;
					break;
					
				}
				if(same==false)
				{
					a[i]=(int) value;
				}
				
			}
	
		}
		System.out.println("Distinct Coupon number are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}


//Array Print
	public static void scanIn(int m, int n, int choice) {
		switch (choice) {
		case 1:
			    Integer intt[][]=new Integer[m][n];
			    System.out.println("Enter the Elements:");
			    for(int i=0;i<m;i++)
			    {
			    	for(int j=0;j<n;j++)
			    	{
			    		intt[i][j]=s.nextInt();
			    	}
			    }
			    
			    ArrayPrint(intt);
				break;
				
		case 2:
		    	Double doub[][]=new Double[m][n];
		    	 System.out.println("Enter the Elements:");
		    	for(int i=0;i<m;i++)
		    	{
		    		for(int j=0;j<n;j++)
		    		{
		    			doub[i][j]=s.nextDouble();
		    		}
		    	}
		    	 ArrayPrint(doub);
		    	break;
		
		case 3:
				Boolean boo[][]=new Boolean[m][n];
				 System.out.println("Enter the Elements:");
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						boo[i][j]=s.nextBoolean();
					}
				}
				 ArrayPrint(boo);
				break;
		
		default:
				break;
		}
	}
	
//Printing Array 
	public static <P> void ArrayPrint( P[][] array) 
	{
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print((array[i][j]+" "));
			}
			System.out.println();
		}
	}

//Sum Of three Integer equals to zero
	public static void SumOfThree(int n, Integer[] a) 
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				for (int k = j+1; k < a.length; k++) 
				{
					if(a[i]+a[j]+a[k]==0)
					{
						count++;
						System.out.println("Number of Triplet:"+count);
						System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");
					}
				}
			}
		}	
	}

//Method to Find Distance
	public static double distance(int x1, int y1) {
		//distance = sqrt(x*x + y*y)
		//√(x2  – x1)² + (y2 – y1)²
		int x=0, y=0;
		double distance=Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
		return distance;
	}
	
//Method for String Permutation
	public static void permute(String str,int l,int r) 
	{
		 if (l == r)
	            System.out.println(str);
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swap(str,l,i);
	                permute(str, l+1, r);
	                str = swap(str,l,i);
	            }
	        }
	}
//swap
	public static String swap(String str, int i,int j) 
	{
			char charArray[]=str.toCharArray();
			char temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
			
	}
	
//Method for StopWatch
	//start
	public static double time() {
		double time=System.currentTimeMillis();
		return time;
	}
	public static void stopWatch(double start,double end) {
	double timelapsed = ((end-start)/1000);
	System.out.println("Time elapsed is:"+timelapsed);
	}

//Method to find Quadratic roots
	public static void quadratic(int a, int b, int c) {
		double delta=(b*b) - (4*a*c);
		//System.out.println(delta);
		if(delta!=0)
		{
			int dsq=(int) Math.sqrt(delta);
			System.out.println(dsq);
			double x1=(double)(-b + dsq)/(2*a);
			double x2=(double)(-b - dsq)/(2*a);
			System.out.println("Roots of x is: ("+x1+","+x2+")");
		}
	}

//Method to Windchill
	public static void windchill(int t, int v) 
	{
		float vpow=(float) Math.pow(v, 0.16);
		double w=(35.74+0.6215*t+(0.4275*t-35.75)*vpow);
		System.out.println("Windmill:"+w);
	}
	
//Method for Anagram String
	public static void anagram(String str1, String str2) 
	{
		int stringLen1=str1.length();
		int stringLen2=str2.length();
		boolean status = false;
		if(stringLen1==stringLen2)
		{
			for(int i=0;i<stringLen1;i++)
			{
				for(int j=0;j<=i;j++)
				{
					if(str1.charAt(i)==str2.charAt(j))
					{
						status=true;
					}
				}
			}
		}
		if(status==true)
		{
			System.out.println(str1+" , "+str2+" are Anagram Strings");
		}
		else
		{
			System.out.println(str1+" , "+str2+" are not Anagram Strings");
		}
	}
//To check number is prime or not
	public static boolean isPrime (int number) {
   
     for(int i=2; i<=number/2; i++){
         if(number % i == 0){
             return false;
         }
     }
     return true;
	}
//Method for Prime Numbers
	public static int[] primeNumbers(int n) 
	{
		 int[] primes = new int[n];
	      int ncounter = 0;
	      int isPrime = 2;
	      while( ncounter < n){
	        boolean prime = true;
	        for (int j=2; j<isPrime; j++){
	          if (isPrime%j ==0){
	            prime = false;
	            break;
	          }
	        }
	        if (prime){
	          primes[ncounter] = isPrime;
	          ncounter++;
	        } 
	        isPrime++;
	       }
	      return primes;
	}

//Method to display array
	public static void display(int array[]) 
	{
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

//Method to find prime anagram
	public static void FindAnagram(int[] out) {
		int len=out.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				//System.out.println(out[i]+" "+out[j]);
				AnagramInteger(out[i],out[j]);
			}
		}
		
	}
//Method for integer anagram
	public static void AnagramInteger(int n1, int n2) {
		//System.out.println(n1+ " " +n2);
		int size=8;
		int num1=n1;int num2=n2;
		long binary_a[]=new long[10];
		long binary_b[]=new long[10];
		int i=0;
		 Arrays.fill(binary_a, 0);
		while(n1>0)
		{
			binary_a[i]=n1%2;
			n1/=2;
			i++;
		}
		int j=0;
		 Arrays.fill(binary_b, 0);
		while(n2>0)
		{
			binary_b[j]=n2%2;
			n2/=2;
			j++;
		}
		Arrays.sort(binary_a);
		Arrays.sort(binary_b);
		for (int j2 = 0; j2 < size; j2++) {
			if(binary_a[i]==binary_b[i])
			{
				System.out.println(num1+" "+num2+"is not a angram");
			}
			else
			{
				System.out.println(num1+" "+num2+"is a angram");	
			}
		}
		
		
	}
	
//Method to find Palindrome
	public static void FindPalindrome(int out[])
	{
		int len=out.length;
		for(int i=0;i<len;i++)
		{
			int r;int reverse = 0;
			int num=out[i];
			int temp=num;
			while(num>0)
			{    
				   r=num%10;   
				   reverse=(reverse*10)+r;    
				   num=num/10;
			}
			if(temp==reverse)
			{
				System.out.println(temp+" is Palindrome");
			}
		}
	}

	
//Method to search integer using binary search
	public static<T extends Comparable<T>> void BinarySearch(T[] array,T search) 
	{
		int length=array.length;
		int first=0;
		int last=length-1;
		int mid;
		
		while(first<=last)
		{	mid=(first+last)/2;
			if(array[mid].compareTo(search)<0)
			{
				first=mid+1;
			}
			else if(array[mid].compareTo(search)==0)
			{
				System.out.println(search+" found in location "+mid);
				break;
			}
			else if(array[mid].compareTo(search)>0)
			{
				last=mid-1;
			}
		}
		if(first > last)
		{
			System.out.println(search+"Not found");
		}
		
			
	}

//Method For Insertion Sort
	public static <T extends Comparable<T>> void insertionSort(T array[]) {
		int length=array.length;
		int j;
		T temp;
		for(int i=0;i<length;i++)
		{
			j=i;
			temp = array[i];
			while(j>0&&temp.compareTo(array[j-1])<0)
			{//
				array[j]=array[j-1];
				j=j-1;
			}
			array[j]=temp;//insert unsorted element
		}
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
	}

//Method for Bubble Sort
	public static <T extends Comparable<T>> void bubbleSort(T array[]) {
		int length=array.length;
		
		
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(array[i].compareTo(array[j])>0)
				{
					T temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
//Method for merge sort
	public static <T extends Comparable<T>> void mergeSort (T a[] , int low , int high )
	{
		if(low < high) 
	    {
			int mid = (low + high )/2;
			mergeSort (a,low,mid);
			mergeSort (a,mid+1,high);             
	        merge(a,low,mid,high);   
	   }                    
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void merge(T a[] , int start, int mid, int end) 
	{
		 //stores the starting position of both parts in temporary variables.
		int p = start ,q = mid+1;
		Object[] arr1 = new Object[end-start+1];
		int k=0;
		for(int i = start ;i <= end ;i++) 
		{
			//checks if first part comes to an end or not .
			if(p>mid)      
		    {
		    	arr1[k++] = a[q++] ;
		    }
			//checks if second part comes to an end or not
			else if ( q > end)   
			{
			   arr1[k++] = a[p++];
			}
			//checks which part has smaller element.
			else if( a[p].compareTo(a[q])<0)     
			{
			   arr1[ k++ ] = a[p++];
			}
			else
			{
			   arr1[ k++ ] = a[q++];
			}
		}
		for (int l=0 ; l< k ;l ++)
		{
			  a[start++] = (T) arr1[l] ;                          
		}
		System.out.println("After Sorting:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

//Find Your Number
	public static int search(int low,int high) {
		if(low>high)
		{
			return -1;
		}
		else if(low==high)
		{
			return low;
		}
			int mid=(low+high)/2;
			System.out.println("Is you number between "+low+ " and "+mid);
			boolean flag=true;
			if(flag != Utility.inputBoolean() )
			{
				low=mid+1;
			}
			else
			{
				high=mid;
			}
		return search(low,high);
	}
	
//Binary Search Word List
	public static void findWord(FileReader file) 
	{
		BufferedReader bf=new BufferedReader(file);
		String string;
		String[] array = null;
		try {
			while((string=bf.readLine())!=null)
			{
				array=string.split(",");
			}
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Enter the word to search:");
		String search=Utility.inputString();
		Utility.BinarySearch(array, search);
	}


//Method to find day of a week
	public static int dayOfWeek(int m, int d, int y) 
	{
		/*y0 = y − (14 − m) / 12
				x = y0 + y0/4 − y0/100 + y0/400
				m0 = m + 12 × ((14 − m) / 12) − 2
				d0 = (d + x + 31m0 / 12) mod 7*/
		int y1=y-(14-m)/12;
		int x=y1+y1/4-y1/100+y1/400;
		int m1=m + 12 * ((14 - m) / 12) - 2;
		int d1=(d+x+31*m1/12) % 7;
		//System.out.println(d1);
		return d1;
	}

//Method for Temperature Conversion
	public static void tempConvert(int choice, int temperature) 
	{
		/*Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
				Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
		 */
		int convert;
		
		switch(choice)
		{
		case 1:	convert=(temperature * 9/5)+32;
				System.out.println("After Conversation:"+convert);
				break;
		
		case 2: convert=(temperature-32)*5/9;
				System.out.println("After Conversation:"+convert);
				break;
		default: break;
		}	
	}
	
//Method to calculate Monthly Payment
	public static void monthlyPayment(double p,double r,int y) 
	{
		double n=y*12;
		double rate= r/(12*100);
		double payment;
		payment=(p*rate)/(1-Math.pow(1+rate,-n));
		System.out.println("Monthly Payment is:"+payment);
	}

//Method to find square root
	public static void sqrt(double c) 
	{
		double t=c;
		//t=((c/t)+t)/2;
		double epslion=1*Math.exp(-15);
		while(Math.abs(t-c/t)>epslion*t)
		{
			t=((c/t)+t)/2;
		}
		System.out.println("Square root of "+c+" is "+t);
		
	}

//Method to convert number into binary
	public static String toBinary(long num) 
	{
		
		String str="";
		int pow=1;
		while(pow<=num/2)
		{
			pow*=2;
		}
		while(pow>0)
		{
			if(num<pow)
			{
				str+=0;
			}
			else
			{
				str+=1;
				num-=pow;
			}
			pow=pow/2;
		}
		return str;
	}

//Method to return number of changes from vending machine
	public static void vendingMachine( int changes) 
	{
		    int notes[]={1, 2, 5, 10, 50, 100, 500, 1000};
			int len=notes.length;
			int count=0;
			for (int i = len-1; i >= 0; i--) 
			{
				while(changes>=notes[i])
				{
					changes-=notes[i];
					System.out.print(notes[i]+" ");
					count++;
				}

			}
			
			System.out.println("\nNumber of changes:"+count);
	}

//Method to swap nibbles
	public static void swapNibbles(String binary) 
	{
		
			if(binary.length()<8)
			{
				while (binary.length()<8)
				{
					binary = "0" + binary;
				}
			}
			System.out.println("Before Swapping Nibbles:"+binary);
			char arr[] = binary.toCharArray();
			for (int i=0;i<3;i++)
			{
				char ch = arr[i];
				arr[i]= arr[i+4];
				arr[i+4]= ch; 
			}
			binary = String.valueOf(arr);
			System.out.println("After Swapping Nibbles:"+binary);
			int c = Integer.parseInt(binary);
			int decimal = 0;
			int power = 0;
			// to convert binary to decimal
			while(true)
			{
				if(c == 0)
				{
					break;
				}
				else 
				{
					int tmp = c%10;
					decimal += tmp*Math.pow(2, power);
					c = c/10;
					power++;
				}
			}
			System.out.println("Number after Swapping Nibbles: " +decimal);
		}

//Method to balance expression
	public static void BalanceParanthesis(String exp) 
	{
		Stack s=new Stack();
		char e[]=exp.toCharArray();
		int explen=exp.length();
		int count1=0;int count2=0;
		for(int i=0;i<explen;i++)
		{
			if(e[i]=='(')
			{
				s.push(e[i]);
				count1++;
			}
			else if(e[i]==')')
			{
				s.pop();
				count2++;
			}
		}
		if(count1==count2)
		{
			System.out.println("Expression is valid");
		}
		else
		{
			System.out.println("Expression is invalid");
		}
	}

	
//Method for unorderlist
	@SuppressWarnings("unchecked")
	public static <N> LinkedList<N> readFileAndAddInList(String string) 
	{
		FileReader fileread=fileRead(string);
		BufferedReader br=new BufferedReader(fileread);
		String line;
		String array[]=null;
		LinkedList<N> list=new LinkedList<N>();
		try {
			while((line=br.readLine())!=null)
			{
				array=line.split(",");
			}
			for (int i = 0; i < array.length; i++) 
			{
				//System.out.println(array[i]);
				list.add((N) array[i]);
			}
			list.display();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	@SuppressWarnings("unchecked")
	public static <N> LinkedList<N> searchInList(LinkedList<N> list, String search)
	{
		list.search((N) search);
		list.display();
		return list;
	}
	public static <N> void readListWriteInFile(String string,LinkedList<N> list) 
	{
		try {
		FileWriter filewrite=fileWrite("/home/bridgeit/workspace/Files/LinklistWord");
		BufferedWriter bw=new BufferedWriter(filewrite);
		String str="";
		Node<N> temp=list.head;
		while(temp!=null)
		{
			str=str+" "+temp.data;
			temp=temp.next;
		}
			System.out.println(str);
			bw.write(str);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//Methods of ordered list
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static OrderedLinkedList searchInListOrder(OrderedLinkedList list, String search)
	{
		list.search(search);
		list.printList();
		return list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static OrderedLinkedList OrderreadFileAndAddInList(String string) {
		
		FileReader fileread=fileRead(string);
		BufferedReader br=new BufferedReader(fileread);
		String line;
		String array[]=null;
		OrderedLinkedList list=new OrderedLinkedList<String>();
		try {
			while((line=br.readLine())!=null)
			{
				array=line.split(",");
			}
			for (int i = 0; i < array.length; i++) 
			{
				//System.out.println(array[i]);
				list.add(array[i]);
			}
		list.printList();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static <N> void OrderreadListWriteInFile(String string,@SuppressWarnings("rawtypes") OrderedLinkedList list) 
	{
		try {
		FileWriter filewrite=fileWrite(string);
		BufferedWriter bw=new BufferedWriter(filewrite);
		String str="";
		@SuppressWarnings("unchecked")
		Node1<N> temp=list.head;
		while(temp!=null)
		{
			str=str+" "+temp.data;
			temp=temp.next;
		}
			//System.out.println(str);
			bw.write(str);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//PalindromeCheck
	public static void isPalindromeChecker(String string) {
		Dequeue d= new Dequeue();
		boolean status=false;
		char[] array=string.toCharArray();
		char first;
		char last;
		for(int i=0;i<array.length;i++)
		{
			d.addRear(array[i]);
		}
		/*int size=d.size();
		System.out.println(size);*/
		while(d.size()>1)
		{
			first=d.removeFront();
			last=d.removeRear();
			System.out.println(first);
			System.out.println(last);
			if(first!=last)
			{
				status=false;
				break;
			}
			else
				status=true;
		}
		if(status==true)
		{
			System.out.println("Is a palindrome");
		}
		else
			System.out.println("Not a palindrome");
	}

//Method for Banking counter
	public static void bankCounter() 
	{
		Queue q=new Queue();
		System.out.println("Enter your choice:");
		System.out.println("1. To add in queue");
		System.out.println("2. To do transaction");
		int choice=inputInt();
		int option;
		double sum=0;
		while(choice==1 && q.size()<q.capacity)
		{
			
			q.enqueue(choice);
			System.out.println("Enter your choice:");
			System.out.println("1. To add in queue");
			System.out.println("2. To do transaction");
			option=inputInt();
			if(option==1)
				choice=option;
			else
				choice=option;
		}
		while(choice==2 && (q.size()<q.capacity))
		{
			if(q.isEmpty())
			{
				System.out.println("Please add into queue First");
				System.out.println("Enter your choice:");
				System.out.println("1. To add in queue");
				System.out.println("2. To do transaction");
				option=inputInt();
				if(option==1)
					q.enqueue(1);
				else
					choice=option;
			}
			else
			{
				System.out.println("Choose Your Transaction:");
				System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Add in queue again\n5.No. of ppl in queue");
				int select=Utility.inputInt();
			
				switch (select) {
				case 1: System.out.println("Enter Your Amount:");
						double amountdepo=inputDouble();
						sum=bankDeposit(amountdepo,sum);
						q.dequeue();
						break;
				case 2: System.out.println("Enter Your Amount:");
						double amountwith=inputDouble();
						sum=bankWithdraw(amountwith,sum);
						q.dequeue();
						break;
				case 3: System.out.println("Balance is:"+sum);
						q.dequeue();
						break;
				case 4: q.enqueue(1);
						break;
				case 5: int size= q.size();
						System.out.println("Number of ppl in the queue are:"+size);
				default:
						break;
				}
			}
		}
	}
//Method to deposit
	public static double bankDeposit(double amount,double sum)
	{
		System.out.println("Amount deposited is:"+amount);
		sum=sum+amount;
		System.out.println("Total amount"+sum);
		return sum;
	}
	
//Method to withdraw
	public static double bankWithdraw(double amount,double sum)
	{
		System.out.println("Amount withdrawn is:"+amount);
		sum=sum-amount;
		System.out.println("Total amount"+sum);
		return sum;
	}
	
//Method for Calendar
	public static void Calendar(int month, int year) 
    {	
    	
        String[] months = {"January", "February", "March","April", "May", "June",
            "July", "August", "September","October", "November", "December"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if ((month == 2) && (isLeapOrNot(year))) 
        {
        	days[month] = 29;
        }
        
        System.out.println("   " + months[month-1] + " " + year);
        System.out.println(" S  M Tu  W Th  F  St");
        int d = dayOfWeek(month, 1, year);
        
        for (int i = 0; i < d; i++)
        {
            System.out.print("   ");
        }
        
        for (int i = 1; i <= days[month-1]; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month-1])) 
            	System.out.println();
        } 
    }

//Method for Binary search Tree
	public static int findBTS(int num) 
	{
		//(2n)!/(n+1)!*n! 
		//2nCn
		int n=2*num;//2n
		int k=num;//n
		int value=1;
		int result=0;
		 // [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
			for(int i=0;i<k;i++)
			{
				value*=(n-i);
				value/=(i+1);
			}
			
		// return 2nCn/(n+1)
		result=value/(num+1);
		return result;
	}
	public static void Prime2D()
	{
		//int count=0;

		//}
	}
//Method for CalendarQueue
	public static void CalendarQueue(int month,int year) 
	{
		QueueLinkList weekday=new QueueLinkList();
		String[] months = {"January", "February", "March","April", "May", "June",
	            "July", "August", "September","October", "November", "December"};

	        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        if ((month == 2) && (isLeapOrNot(year))) 
	        {
	        	days[month] = 29;
	        }
	        System.out.println("\t\t\t" + months[month-1] + " " + year);
	        System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
	        int d = dayOfWeek(month, 1, year);
	        for(int i=0;i<d;i++)
	        {
	        	weekday.insert("\t");
	        }
	        for (int i = 1; i <= days[month-1]; i++)
	        {
	            //System.out.printf("%2d ", i);
	            weekday.insert("\t"+i);
	            if (((i + d) % 7 == 0) || (i == days[month-1])) 
	            weekday.insert("\n");
	        } 
	        weekday.display();
	}
//Method for Calendar Stack
	public static void CalendarStack(int month,int year) {
		StackLinkList space=new StackLinkList();
		StackLinkList weekday=new StackLinkList();
		String[] months = {"January", "February", "March","April", "May", "June",
	            "July", "August", "September","October", "November", "December"};

	        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        if ((month == 2) && (isLeapOrNot(year))) 
	        {
	        	days[month] = 29;
	        }
	        System.out.println("\t\t\t" + months[month-1] + " " + year);
	        System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
	        int d = dayOfWeek(month, 1, year);
	        for(int i=0;i<d;i++)
	        {
  	        	space.insert("\t");
	        }
	        space.display();
	        for (int i = days[month-1] ; i >=1 ; i--)
	        {
	            //System.out.printf("%2d", i);
	            weekday.insert("\t"+i);
	            if (((i + d) % 7 == 0) || (i == days[month-1])) 	
	            weekday.insert("\n");
	        } 
	        weekday.display();
	        
	}
//Method for Inventory Data Management
	public static void inventory(FileReader fileread) throws IOException, ParseException {
			JSONParser parse=new JSONParser();
			JSONObject object=(JSONObject) parse.parse(fileread);
			//System.out.println(object);
			Iterator<?> iterator=object.keySet().iterator();//Keys of Object(rice,wheat,pulses)
			while(iterator.hasNext())
			{
				String topkey=(String)iterator.next();
				JSONObject obj=(JSONObject) object.get(topkey);
				Iterator<?> iterate = obj.keySet().iterator();//keys of each specific object
				while(iterate.hasNext())
				{
					String key=(String) iterate.next();
					System.out.println(key+":"+obj.get(key));
				}
				Integer amount=(Integer.parseInt(obj.get("Price").toString())) * (Integer.parseInt(obj.get("Weight").toString()));
				System.out.println("The total cost of "+obj.get("Name")+" is: "+amount);
				System.out.println();
			}
	}


//Method for regular Expression
	public static void regularExpression(String firstname, String lastname, String mobile) 
	{
		String message="Hello <<name>>, We have your full name as <<full name>> in our system.\n" +
				"Your contact number is 91-XXXXXXXXXX. Please,let us know in case of any\n" +
				"clarification.\nThank you BridgeLabz XX/XX/XXXX .";	
		Date d=new Date();
		String date=new SimpleDateFormat().format(d);
		String name=firstname+" "+lastname;
		message=message.replace("<<name>>", firstname);
		message=message.replace("<<full name>>", name);
		message=message.replace("XXXXXXXXXX", mobile);
		message=message.replace("XX/XX/XXXX", date);
		System.out.println(message);
		}

//Method for Stock Report
	public static void stockReport(FileReader fileread) throws IOException, ParseException 
	{
		JSONParser parse=new JSONParser();
		
		int total = 0;
		JSONObject object=(JSONObject) parse.parse(fileread);
		//System.out.println(object);
		Iterator<?> iterator=object.keySet().iterator();
		while(iterator.hasNext())
		{
			String topkey=(String)iterator.next();
			JSONObject obj=(JSONObject) object.get(topkey);
			System.out.println("Company name:"+topkey);
			long price=(Long) obj.get("Price");
			long num=(Long) obj.get("NumShare");
			total+=price*num;
			System.out.println("Price:"+price);
			System.out.println("Number Of Shares:"+num);
			System.out.println("Total Stock is:"+price*num);
			System.out.println();
		}
		System.out.println("Total amount of shares is:"+total);
	}

//Method for Inventory Management
	public static void inventoryManage(FileReader fileread) throws IOException, ParseException {
		JSONParser parse=new JSONParser();
		JSONObject object=(JSONObject) parse.parse(fileread);
		//System.out.println(object);
		int total=0;
		Iterator<?> iterator=object.keySet().iterator();//Keys of Object(rice,wheat,pulses)
		while(iterator.hasNext())
		{
			String topkey=(String)iterator.next();
			JSONObject obj=(JSONObject) object.get(topkey);
			Iterator<?> iterate = obj.keySet().iterator();//keys of each specific object
			while(iterate.hasNext())
			{
				String key=(String) iterate.next();
				System.out.println(key+":"+obj.get(key));
			}
			Integer amount=(Integer.parseInt(obj.get("Price").toString())) * (Integer.parseInt(obj.get("Weight").toString()));
			System.out.println("The total cost of "+obj.get("Name")+" is: "+amount);
			System.out.println();
			total=total+amount;		
	}
		System.out.println("The total Amount of inventory is:"+total);
	}

//Method for Commercial data Processing
	public static void StockAccount() throws IOException, ParseException 
	{
		System.out.println("Enter Your Chocie");
		System.out.println("1.Create a new Account\n2.Value Of\n3.Buy Shares\n4.Sell Shares\n5.Save Account\n5.Print Report");
		int choice=Utility.inputInt();
		switch(choice)
		{
		case 1: System.out.println("Creating Account");
				createAccount();
				break;
		case 2: System.out.println("");
				valueOf();
				break;
		case 3: System.out.println("You are buying Shares");
				System.out.println("Enter the Symbol:");
				String symbol=Utility.inputString();
				System.out.println("Enter the amount:");
				int amount=Utility.inputInt();
				buyShare(symbol,amount);
				break;
		case 4: System.out.println("You are selling shares");
				System.out.println("Enter the Sysmbol:");
				String symbol1=Utility.inputString();
				System.out.println("Enter the amount:");
				int amount1=Utility.inputInt();
				sellShare(symbol1,amount1);
				break;
		case 5: System.out.println("Saving into file");
				String filename="";
				saveFile(filename);
				break;
		case 6: System.out.println("Print Report");
		 		printReport();
		 		break;
		default: break;
		}
		
	}

	public static void printReport() {
		
		
	}

	public static void saveFile(String filename) {
		
		
	}

	@SuppressWarnings("unchecked")
	public static void sellShare(String symbol, int amount) throws IOException, ParseException
	{
		File companyStock=new File("/home/bridgeit/workspace/Files/companyStock.json");
		File customerShare=new File("/home/bridgeit/workspace/Files/customerShare.json");
		if(companyStock.exists() && customerShare.exists())
		{
				//Stock reading
				FileReader fr=new FileReader(companyStock);
				JSONParser parse=new JSONParser();
				JSONArray stockArray=(JSONArray) parse.parse(fr);
				JSONObject stock=new JSONObject();
			
			
				//Share reading
				FileReader fr1=new FileReader(customerShare);
				JSONParser par=new JSONParser();
				JSONArray shareArray = (JSONArray) par.parse(fr1);
				JSONObject share=new JSONObject();
				
				System.out.println("Enter Name:");
				String name=inputString();
				Iterator<?> iterateStock = stockArray.iterator();
				Iterator<?> iterateShare = shareArray.iterator();
				while(iterateShare.hasNext())
				{
					JSONObject shareobj=(JSONObject) iterateShare.next();
					
					if(name.equals(shareobj.get("name")));
					{
								while(iterateStock.hasNext())
								{
									JSONObject stockobj=(JSONObject) iterateStock.next();
									System.out.println(stockobj);
									if(symbol.equals(stockobj.get("Symbol")))
									{
										int price=Integer.parseInt(stockobj.get("Price").toString());
										int balance=Integer.parseInt(shareobj.get("Balance").toString());
										System.out.println(price+" "+balance);
										if(price>=amount)
										{
											balance-=amount;
											price+=amount;
											share.remove("Balance");
											stock.remove("Price");
											share.put("Balance", balance);
											stock.put("Price", price);
											shareArray.add(share);
											stockArray.add(stock);
											
										}
									}
								}
					}
				}
				//FileWriter fw=new FileWriter(companyStock);
				FileWriter fw1=new FileWriter(customerShare);
				//fw.write(stockArray.toString());
				//System.out.println(stockArray);
				fw1.write(shareArray.toString());
				System.out.println(shareArray);
				fw1.flush();
				fw1.close();
		}	
		
		
	}

	@SuppressWarnings("unchecked")
	public static void buyShare(String symbol, int amount) throws IOException, ParseException
	{
		File companyStock=new File("/home/bridgeit/workspace/Files/companyStock.json");
		File customerShare=new File("/home/bridgeit/workspace/Files/customerShare.json");
		if(companyStock.exists() && customerShare.exists())
		{
				//Stock reading
				FileReader fr=new FileReader(companyStock);
				JSONParser parse=new JSONParser();
				JSONArray stockArray=(JSONArray) parse.parse(fr);
				JSONObject stock=new JSONObject();
			
			
				//Share reading
				FileReader fr1=new FileReader(customerShare);
				JSONParser par=new JSONParser();
				JSONArray shareArray = (JSONArray) par.parse(fr1);
				JSONObject share=new JSONObject();
				
				System.out.println("Enter Name:");
				String name=inputString();
				Iterator<?> iterateStock = stockArray.iterator();
				Iterator<?> iterateShare = shareArray.iterator();
				while(iterateShare.hasNext())
				{
					JSONObject shareobj=(JSONObject) iterateShare.next();
					
					if(name.equals(shareobj.get("name")));
					{
								while(iterateStock.hasNext())
								{
									JSONObject stockobj=(JSONObject) iterateStock.next();
									System.out.println(stockobj);
									if(symbol.equals(stockobj.get("Symbol")))
									{
										int price=Integer.parseInt(stockobj.get("Price").toString());
										int balance=Integer.parseInt(shareobj.get("Balance").toString());
										System.out.println(price+" "+balance);
										if(price>=amount)
										{
											balance+=amount;
											price-=amount;
											share.remove("Balance");
											stock.remove("Price");
											share.put("Balance", balance);
											stock.put("Price", price);
											shareArray.add(share);
											stockArray.add(stock);
											
										}
									}
								}
					}
				}
				//FileWriter fw=new FileWriter(companyStock);
				FileWriter fw1=new FileWriter(customerShare);
				//fw.write(stockArray.toString());
				//System.out.println(stockArray);
				fw1.write(shareArray.toString());
				System.out.println(shareArray);
				fw1.flush();
				fw1.close();
		}	
		
	}

	public static void valueOf() {
	
	}

	@SuppressWarnings({ "unchecked"})
	public static void createAccount() throws IOException, ParseException {
		File customerFile=new File("/home/bridgeit/workspace/Files/customerShare.json");
		if(customerFile.exists())
		{
		
			while(true)
			{
				System.out.println("Ready to create account? Yes or No");
				if(inputString().equals("yes"))
				{
				FileReader fr=new FileReader(customerFile);

				JSONParser parse=new JSONParser();
				JSONArray jarray=(JSONArray) parse.parse(fr);
				JSONObject jobject=new JSONObject();
				
				System.out.println("Enter Your Name:");
				String name=inputString();
				System.out.println("Enter the Balance:");
				int balance=inputInt();
				System.out.println("Enter the share count:");
				int shareCount=inputInt();
				
				jobject.put("Name", name);
				jobject.put("Balance", balance);
				jobject.put("ShareCount", shareCount);
				jarray.add(jobject);
				
				FileWriter fw=new FileWriter(customerFile);
				fw.write(jarray.toString());
				System.out.println(jarray);
				fw.flush();
				fw.close();
				}
				else
				{
					System.out.println("Thank You");
					break;
				}
			}		
		}
		StockAccount();
	}

	public static void addressBook() {
		System.out.println("Enter the choice:\n1.Add\n2.Edit\n3.Delete");
		int choice=Utility.inputInt();
		switch (choice) {
		case 1:addAddress();
			break;
			
		case 2:editAddress();
			break;
			
		case 3:deleteAddress();
			break;
		default:
			break;
		}
	}

	public static void deleteAddress() {
			
	}

	public static void editAddress() {
		
	}

	public static void addAddress() {
		System.out.println("Enter First Name:");
		String firstname=inputString();
		System.out.println("Enter Last Name:");
		String lastname=inputString();
		System.out.println("Enter Address:");
		String address=inputString();
		System.out.println("Enter City:");
		String city=inputString();
		System.out.println("Enter State:");
		String state=inputString();
		System.out.println("Enter Zip:");
		int zip=inputInt();
		System.out.println("Enter Phone Number:");
		long phone=inputlong();
		
		JSONObject person=new JSONObject();
		 person.put("Firstname", firstname);
		 person.put("Firstname", lastname);
		 person.put("Address", address);
		 person.put("City", city);
		 person.put("State", state);
		 person.put("Zip", zip);
		 person.put("Phone", phone);
	}
}
