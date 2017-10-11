package test9_28;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {

	public static void main(String[] args) {
		Notice notice1 = new Notice(1, "hi", "fyb", new Date());
		Notice notice2 = new Notice(2, "good", "f", new Date());
		Notice notice3 = new Notice(3, "nice", "y", new Date());

		ArrayList noticeList = new ArrayList();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);

		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
		}

		Notice notice4 = new Notice(4, "******", "ad", new Date());

		noticeList.add(1, notice4);

		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
		}

		noticeList.remove(2);
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
		}
		
		
		System.out.println("***************");
		notice4.setTitle("66666666666");
		noticeList.set(1, notice4);
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
		}
	}

}
