package oopAssignment;

import java.awt.TrayIcon.MessageType;
import java.time.LocalDateTime;

public class Timmer implements Runnable{

	@Override
	public void run() {
		String textNotify = "";
		boolean hasJobNotify = false;
		while (true) {
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (!Main.iconsystemtray.isNotify()) continue;
			
			LocalDateTime now = LocalDateTime.now();
			
			for (Job j: Main.listjobnotify) {
			
				if (j.getFromDate().getHour() == now.getHour() && j.getFromDate().getMinute() == now.getMinute()) {
					textNotify = textNotify + j.getTextArea().getText() + "\n";
					hasJobNotify = true;
				}
			}
			if (hasJobNotify) {
				Main.iconsystemtray.getTrayIcon().displayMessage("Công việc của bạn đã đến!", textNotify, MessageType.NONE);
			}
			hasJobNotify = false;
			textNotify = "";
		}
	}
	
}


