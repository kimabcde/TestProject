package inner.day0121;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p = new Panel();
		Button b = new Button("push1");
		Button b1 = new Button("push2");
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭 by inner");
			}
		});
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
			}
		});
		
		
		p.add(b);
		p.add(b1);
		f.add(p);
		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);
	}

}


//class EventHandler implements ActionListener{
////버튼을 클릭할때마다(event) 호출되는 메서드
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼이 눌렸습니다.");
//	}
//}