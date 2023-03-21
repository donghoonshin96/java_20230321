package day16;

import java.util.ArrayList;

import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/*
		 * 문자열(이름)을 담는 리스트 생성후, 스트림으로 생성 정렬(sorted)하여 출력(forEach)
		 */

		ArrayList<String> list = new ArrayList<String>();
		list.add("전재준");
		list.add("박연진");
		list.add("손명오");
		list.add("최혜정");
		list.add("이사라");
		list.add("가나다라마바사");
		list.add("김아자차카타파하");

		Stream<String> st = list.stream();
		st.sorted().forEach(s -> System.out.println(s));
		System.out.println("---------");

		// 글자수가 5글자 이상인 이름만 출력
		list.stream().filter(s -> s.length() >= 5).sorted().forEach(System.out::println);
		System.out.println("--------");
		list.stream().filter(n -> n.length() >= 5).forEach(System.out::println);
		System.out.println("--------");
		// 각자 이름의 글자수를 출력
		list.stream().map(n -> n.length()).forEach(System.out::println);
	}

}
