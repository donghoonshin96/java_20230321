package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		do {
			wm.printMenu();
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				wm.add(scan);
				break;
			case 2:
				wm.printWord();
				break;
			case 3:
				wm.searchWord(scan);
				break;
			case 4:
				wm.updateWord();
				break;
			case 5:
				wm.deleteWord();
				break;
			case 6:
				break;
			default:
				System.out.println("메뉴 오류~!!");
			}

		} while (menu != 6);
		System.out.println("종료~!!");
//		ArrayList<Word> list = new ArrayList<>();
//		System.out.println("입력할 단어 개수:"); // 5개의 단어만 추가
//		int size = scan.nextInt();
//		while (list.size() < size) {
//			System.out.println("단어:");
//			String word = scan.next();
//			System.out.println("의미:");
//			// nextList() : 공백을 포함
//			scan.nextLine(); // 위에서 입력한 enter를 버려주는 값이
//			String mean = scan.nextLine(); // 가다의 뜻으로 잘 간다는 의미이다.
//			list.add(new Word(word, mean));
//		}
//
//		// 정렬
//		Collections.sort(list, new Comparator<Word>() {
//
//			@Override
//			public int compare(Word o1, Word o2) {
//				return o1.getWord().compareTo(o2.getWord());
//			}
//		});
//
//		// 출력
//		for (Word tmp : list) {
//			System.out.println(tmp);
//		}
	}

}