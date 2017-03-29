package com.ui;

import com.tw.BaseFrame;

public class SSWDFrame extends BaseFrame {

	public SSWDFrame(String title, int width, int height) {
		super(title, width, height);

	}

	public static void main(String[] args) {
		SSWDFrame ss = new SSWDFrame("Ë­ÊÇÎÔµ×", 806, 629);
		ss.showStart();
	}

	private void showStart() {
		StartPanel st = new StartPanel(this);
		showPanel(st);
	}

	public void showGame() {
		GamePanel gp = new GamePanel(this);
		showPanel(gp);
	}

}
