package day17;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
public class BufferedReaderEx03 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/* out.txt파일을 읽어들여 map에 저장 후 
		 * 이름:점수 
		 * 총 합계 총인원 출력
		 * 
		 * map.put(name, score);
		 * 입력받은값은 전부 String 계산을 위해서는 int 자료형으로 변환이 필요
		 *  Integer.parseInt(문자값);
		 * */
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		
		while(true) {
			String line = br.readLine();  //홍길동 79
			if(line == null) {break;}  //마지막라인일경우 null 입력되면 반복문 빠져나감.
			
			//홍길동 79 substring(startindex=포함, endindex=미포함)
			String name = line.substring(0, line.indexOf(" "));
			//endindex를 적지 않으면 끝까지
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(name, score);
		}
		//System.out.println(map);
		int sum =0;
		
		for(String n: map.keySet()) {
			System.out.println(n+":"+map.get(n));
			sum+= map.get(n);
		}
		System.out.println("총 합계 : "+sum+", 총 인원수 : "+map.size());
		
		br.close();
		
		
		
	}
}