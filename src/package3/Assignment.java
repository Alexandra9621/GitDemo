package package3;

import java.util.ArrayList;
import java.util.List;



public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         
         ArrayList<Integer> numbers = new ArrayList<>();
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);
         numbers.add(4);
         numbers.add(5);
         numbers.add(6);
         numbers.add(7);
         numbers.add(8);
         numbers.add(9);
         numbers.add(10);
         
         numbers.stream().filter(number -> number % 2 == 0).forEach(number ->System.out.println(number));
         numbers.stream().filter(number -> number % 2!=0).forEach(number ->System.out.println(number));
       int sumOfEvens =  numbers.stream().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum();
         System.out.println("Sum of even numbers:" + sumOfEvens);
	}
	
}
