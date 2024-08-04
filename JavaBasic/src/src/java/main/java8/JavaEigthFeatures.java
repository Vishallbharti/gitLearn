package src.java.main.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaEigthFeatures {
	
	public void reverseArray() {
		int a[] = {3,4,5,24,5,7,4};
		int b[] =  IntStream.range(0, a.length).map(i->a[a.length - i-1]).toArray();
		
		System.out.println("Reverse an array");
		for(Integer item: b) {
			System.out.println(item);
		}
	}
	
	public void mergeTwoArray() {
		int a[] = {4,5,6,4,1,6,85,3};
		int b[] = {8,9,3,4,1,7,8,2};
		int c[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().toArray();
		
		System.out.println("Merge two array with distinct elemets!");
		for(Integer item: c) {
			System.out.println(item);
		}
	}
	
	public void reverseEachWordInSentence() {
		String str = "Spring Boot is framework of Java";
		String reverseString = Stream.of(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		System.out.println("Reverse each word of sentence!");
		System.out.println(reverseString);
	}

}
