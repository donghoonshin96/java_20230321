package day16;

import java.util.ArrayList;
import java.util.List;

public class CustomerInfo{

	public static void main(String[] args) {
		ArrayList<Customer> cst = new ArrayList<>();
		cst.add(new Customer("이순신", 40, 100));
		cst.add(new Customer("신사임당", 35, 100));
		cst.add(new Customer("이아들", 10, 50));

		System.out.println("고객정보");
		int sum = cst.stream().mapToInt(n -> n.getCost()).sum();
		//cst.stream().forEach(System.out::println);
		cst.stream().forEach(n->{
			String name = n.getName();
			int age = n.getAge();
			int cost = n.getCost();
			System.out.println(name+" "+age+"세 비용:"+cost);
		});
		System.out.println("-------------------");
		System.out.print("총 여행비용:");
		int sum1 = cst.stream()
				.mapToInt(n->n.getCost())
				.sum();
		System.out.println(sum1+"만원");
		
		//20세 이상 성인만 이름을 정렬하여 출력
		System.out.println("20세 이상 성인만 이름을 정렬하여 출력");
		cst.stream()
		.filter(n->n.getAge()>=20)
		.sorted()
		.forEach(n->{
			String name = n.getName();
			int age = n.getAge();
			int cost = n.getCost();
			System.out.println(name+" "+age+"세 비용:"+cost);
			});

	}

	
}
