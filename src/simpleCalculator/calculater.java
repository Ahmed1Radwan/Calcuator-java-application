package simpleCalculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class calculater implements Calculator {
	
	

	double firstNum;
	double secondNum;
	double result;
	String operation = null;
	String prevOperation = null;
	String nextOperation = null;
	
	// store the full operations like this 7+3 = 10
	Deque<String> operations = new LinkedList<String>();
	// store operations like this 7+3
	Deque<String> storingOperations = new LinkedList<String>();
	// store operations like this 7+3 and make operations like curr , prev , next through it
	Deque<String> dequeOperations = new LinkedList<String>();
	
	int outputCounter = 0;
	int inputCounter = 0;
	File file;
	
	@Override
	public void input(String s) {
		// TODO Auto-generated method stub
		try {
			
			storingOperations.addLast(s);
		
			String[] t = s.split("(?=[-+*/%()])|(?<=[^-+*/%][-+*/%])|(?<=[()])");
			
			firstNum = Double.parseDouble(t[0]);
			secondNum = Double.parseDouble(t[2]);
			operation = t[1];
			
			
			
			if(inputCounter == 5) {
				inputCounter = 0;
				//System.out.println(storingOperations.getFirst());
				storingOperations.pollFirst();
			}
			inputCounter++;
			
			
			dequeOperations = new LinkedList(storingOperations);
			
			prevOperation = dequeOperations.getFirst();
			nextOperation = dequeOperations.getLast();
			/*
				for(int i=0;i<t.length;i++) {
					System.out.println(t[i]);
				}
			*/
			
			
		}
		catch (Exception e){
			throw new RuntimeException("Syntax of the input must be number then  operation then number");
			
		}
		
		
		
	}

	@Override
	public String getResult() {
		// TODO Auto-generated method stub
		
		try {
			
			String answer = null;
			
				if(operation.charAt(0) == '+') {
				
					result = firstNum + secondNum;
					answer = Double.toString(result);
					
				}else if(operation.charAt(0) == '-') {
				
					result = firstNum - secondNum;
					answer = Double.toString(result);
					
				
				}else if(operation.charAt(0) == '*') {
				
					result = firstNum * secondNum;
					answer = Double.toString(result);
					
				
				}else if(operation.charAt(0) == '/') {
				
					result = firstNum / secondNum;
					answer = Double.toString(result);
					
				
				}else if(operation.charAt(0) == '%') {
				
					result = firstNum % secondNum;
					answer = Double.toString(result);
					
					
				}
				
				if(outputCounter == 5) {
					operations.pollFirst();
					outputCounter = operations.size();
				}
				
				operations.addLast( String.valueOf(firstNum) + operation + String.valueOf(secondNum) + "=" + answer);
				outputCounter++;
				
				
			return answer;
		}catch(Exception e){
			
			throw new RuntimeException("Syntax of the input must be number then  operation then number");
			
		}
		
		
	}

	@Override
	public String current() {
		// TODO Auto-generated method stub
		
		return dequeOperations.peekLast();
		
	}

	@Override
	public String prev() {
		// TODO Auto-generated method stub
		if(dequeOperations.size()==0 || prevOperation == dequeOperations.getLast()) {
			return null;
		}
		
		dequeOperations.addFirst(dequeOperations.getLast());
		dequeOperations.pollLast();
		
		return dequeOperations.peekLast();
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		if(dequeOperations.size()==0 || nextOperation == dequeOperations.getLast()) {
			return null;
		}
		
		dequeOperations.addLast(dequeOperations.getFirst());
		dequeOperations.pollFirst();
		return dequeOperations.peekLast();
	}
	
	@Override
	public void save() {
		
		// TODO Auto-generated method stub
		
		
		try {
			file = new File("newFile.txt");
			
			
			if(file.createNewFile()) {
				PrintWriter writer = new PrintWriter("newFile.txt", "UTF-8");
				Iterator<String> it = dequeOperations.iterator();
				
				while(it.hasNext()) {
					writer.println(it.next());
					//System.out.println(it.next());
				}
				writer.close();
				
			}else {
				
				file.delete();
				file = new File("newFile.txt");
				
				PrintWriter writer = new PrintWriter("newFile.txt", "UTF-8");
				Iterator<String> it = dequeOperations.iterator();
				
				while(it.hasNext()) {
					writer.println(it.next());
					//System.out.println(it.next());
				}
				writer.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
		
		try {
			
				BufferedReader br;
				br = new BufferedReader(new FileReader("newFile.txt"));
				String st = null; 
			
				dequeOperations.clear();
				operations.clear();
				  try {
					  
					while ((st = br.readLine()) != null) {
						 System.out.println(st);
						 
						 dequeOperations.addLast(st);
						 operations.addLast(st);
					}
					
					prevOperation = dequeOperations.getFirst();
					nextOperation = dequeOperations.getLast();
					
				
				   
				  } catch (IOException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
				  }
			
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		 
		  
	} 
	
}