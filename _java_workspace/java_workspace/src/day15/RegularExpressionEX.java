package day15;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEX {

	public static void main(String[] args) {
		// RegularExpression : 정규표현식
		// 문자의 형식을 검증하는 형태
		// 전화번호, 비밀번호
		// [a-zA-Z] : 대소문자 1개 가능
		// \d: 숫자 
		// \w:한 개의 알파벳 또는 한개의 숫자, [a-zA-Z_0-9] : 대소문자,숫자 1개만 가능
		// . : 모든 문자 중 한 개의 문자
		// ? : 없음 또는 한개 
		// * : 없음 또는 한 개 이상
		// {n} : 정확히n개 
		// {n,m} : n개부터m개까지
		// {3, } : 3자리 이상
		//(02|010)-\d{3,4}-\d{4} => 010-111-1111 02-111-1111
		
		//배열 중 b로 시작하는 단어만 찾기
		String[]strArr = {"bat", "baby", "car", "cb", "date",
				"disk", "count", "apple", "banana"};
		Arrays.sort(strArr); //배열 정렬
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		Pattern pattern = Pattern.compile("c[a-zA-Z]*");
		for(String str : strArr) {
			Matcher matcher = pattern.matcher(str); //패턴이 일치가되면 true를 반환
			if(matcher.matches()) {
				System.out.println(str+" ");
			}
		}

	}

}
