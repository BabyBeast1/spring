package sample04;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukDelete implements SungJuk {

	@Setter
	private List<SungJukDTO2> list;
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름 입력 : ");
		String name = scan.next();
		
		Iterator<SungJukDTO2> it = list.iterator();
		int sw = 0;
		while(it.hasNext()) {//항목이 있으면 True, 없으면 False
			
			//it가 가리키는 항목을 꺼내서 저장한 후, it는 다음 항목으로 이동
			SungJukDTO2 sungJukDTO2 = it.next();
			
			if(sungJukDTO2.getName().equals(name)) {
				sw = 1;
				it.remove(); //아까 보관한 항목을 제거
				System.out.println(name +"님의 데이터를 삭제하였습니다.");
				
				break;
			}
		}//while

		if(sw == 0) System.out.println("찾고자하는 이름이 없습니다."); //sw = switch
	}

}
