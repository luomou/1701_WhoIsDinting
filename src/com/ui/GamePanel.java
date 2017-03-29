package com.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import com.hx.socket.ClientThread;
import com.tw.BasePanel;

public class GamePanel extends BasePanel {

	protected static ClientThread ct;
	private JTextArea ja;

	private JDialog jd;
	private JDialog jd2;
	private JDialog jd3;
	private JDialog jd4;
	private JDialog jd5;
	private JDialog jd6;
	private JDialog jd7;
	private JDialog jd8;
	private JDialog jd9;
	private JDialog jd1;
	private JDialog jda;
	private JDialog jdc;
	private JDialog jde;
	private JDialog jdr;

	public GamePanel(final JFrame gameFrame) {
		super(gameFrame);
		// TODO Auto-generated constructor stub
		addJTF();
		addFS();
		addWBK();
		addABS();
		addWC();
		addQWE();
		addCF();
		addSSL();
		addTW();
		addLLF();
		addAN();
		addLL();
		addJY();
		addJS();

		gameFrame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentMoved(ComponentEvent e) {

				jd.setLocation(gameFrame.getLocationOnScreen().x + 608,
						gameFrame.getLocationOnScreen().y + 30);
				jd2.setLocation(gameFrame.getLocationOnScreen().x + 630,
						gameFrame.getLocationOnScreen().y + 580);

				jd3.setLocation(gameFrame.getLocationOnScreen().x + 630,
						gameFrame.getLocationOnScreen().y + 530);
				jd4.setLocation(gameFrame.getLocationOnScreen().x + 8,
						gameFrame.getLocationOnScreen().y + 52);
				jd5.setLocation(gameFrame.getLocationOnScreen().x + 8,
						gameFrame.getLocationOnScreen().y + 380);
				jd6.setLocation(gameFrame.getLocationOnScreen().x + 150,
						gameFrame.getLocationOnScreen().y + 32);
				jd7.setLocation(gameFrame.getLocationOnScreen().x + 150,
						gameFrame.getLocationOnScreen().y + 200);
				jd8.setLocation(gameFrame.getLocationOnScreen().x + 230,
						gameFrame.getLocationOnScreen().y + 110);
				jd9.setLocation(gameFrame.getLocationOnScreen().x + 400,
						gameFrame.getLocationOnScreen().y + 110);
				jd1.setLocation(gameFrame.getLocationOnScreen().x + 150,
						gameFrame.getLocationOnScreen().y + 535);

				jda.setLocation(gameFrame.getLocationOnScreen().x + 220,
						gameFrame.getLocationOnScreen().y + 590);
				jde.setLocation(gameFrame.getLocationOnScreen().x + 410,
						gameFrame.getLocationOnScreen().y + 590);
				jdr.setLocation(gameFrame.getLocationOnScreen().x + 505,
						gameFrame.getLocationOnScreen().y + 590);

			}
		});
	}

	private void addJS() {
		jdr = new JDialog(gameFrame, false);
		jdr.setSize(95, 30);
		jdr.setResizable(false);
		jdr.setLocationRelativeTo(null);
		jdr.setUndecorated(true);
		jdr.setLocation(gameFrame.getLocationOnScreen().x + 505,
				gameFrame.getLocationOnScreen().y + 590);
		JButton jb = new JButton("结束发言");
		jb.setFont(new Font("楷体", Font.BOLD, 14));
		jb.setForeground(Color.black);
		jb.setBackground(Color.white);

		jdr.add(jb);
		jdr.setVisible(true);

	}

	private void addJY() {
		jde = new JDialog(gameFrame, false);
		jde.setSize(75, 30);
		jde.setResizable(false);
		jde.setLocationRelativeTo(null);
		jde.setUndecorated(true);
		jde.setLocation(gameFrame.getLocationOnScreen().x + 410,
				gameFrame.getLocationOnScreen().y + 590);
		JButton jb = new JButton("发送");
		jb.setFont(new Font("楷体", Font.BOLD, 14));
		jb.setForeground(Color.black);
		jb.setBackground(Color.white);

		jde.add(jb);
		jde.setVisible(true);

	}

	private void addLL() {
		jdc = new JDialog(gameFrame, false);
		jdc.setSize(95, 30);
		jdc.setResizable(false);
		jdc.setLocationRelativeTo(null);
		jdc.setUndecorated(true);
		jdc.setLocation(gameFrame.getLocationOnScreen().x + 220,
				gameFrame.getLocationOnScreen().y + 590);
		JButton jb = new JButton("开始游戏");
		jb.setFont(new Font("楷体", Font.BOLD, 14));
		jb.setForeground(Color.white);
		jb.setBackground(Color.red);

		jdc.add(jb);
		jdc.setVisible(true);
	}

	private void addAN() {
		jda = new JDialog(gameFrame, false);
		jda.setSize(65, 30);
		jda.setResizable(false);
		jda.setLocationRelativeTo(null);
		jda.setUndecorated(true);
		jda.setLocation(gameFrame.getLocationOnScreen().x + 150,
				gameFrame.getLocationOnScreen().y + 590);
		JButton jb = new JButton("准备");
		jb.setFont(new Font("微软雅黑", Font.BOLD, 14));
		jb.setForeground(Color.white);
		jb.setBackground(Color.green);

		jda.add(jb);
		jda.setVisible(true);
	}

	private void addLLF() {
		jd1 = new JDialog(gameFrame, false);
		jd1.setSize(450, 50);
		jd1.setResizable(false);
		jd1.setLocationRelativeTo(null);
		jd1.setUndecorated(true);
		jd1.setLocation(gameFrame.getLocationOnScreen().x + 150,
				gameFrame.getLocationOnScreen().y + 535);
		JTextField jt = new JTextField();
		jt.setBounds(150, 535, 450, 50);

		jd1.add(jt);

		jd1.setVisible(true);

	}

	private void addTW() {
		jd7 = new JDialog(gameFrame, false);
		jd7.setSize(450, 380);
		jd.setResizable(false);
		jd7.setLocationRelativeTo(null);
		jd7.setUndecorated(true);
		jd7.setLocation(gameFrame.getLocationOnScreen().x + 150,
				gameFrame.getLocationOnScreen().y + 150);
		JTextArea ja = new JTextArea();
		ja.setLineWrap(true);
		JScrollPane js = new JScrollPane(ja);
		js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jd7.add(js);
		jd7.setVisible(true);

	}

	private void addSSL() {
		jd9 = new JDialog(gameFrame, false);
		jd9.setSize(63, 25);
		jd9.setResizable(false);
		jd9.setLocationRelativeTo(null);
		jd9.setUndecorated(true);
		jd9.setLocation(gameFrame.getLocationOnScreen().x + 400,
				gameFrame.getLocationOnScreen().y + 110);
		JButton jb = new JButton("投TA");
		jb.setFont(new Font("楷体", Font.PLAIN, 14));
		// jb.setBackground(Color.RED);

		jd9.add(jb);
		// jd9.setLayout(null);
		jd9.setVisible(true);

	}

	private void addCF() {
		jd8 = new JDialog(gameFrame, false);
		jd8.setSize(150, 25);
		jd8.setResizable(false);
		jd8.setLocationRelativeTo(null);
		jd8.setUndecorated(true);
		jd8.setLocation(gameFrame.getLocationOnScreen().x + 230,
				gameFrame.getLocationOnScreen().y + 110);
		Object[] sz = { "速度快", "三个", "二哥" };
		JComboBox XLK = new JComboBox(sz);
		jd8.add(XLK);
		jd8.setVisible(true);

	}

	// 中上JDialog
	private void addQWE() {
		jd6 = new JDialog(gameFrame, false);
		jd6.setSize(450, 30);
		jd6.setResizable(false);
		jd6.setLocationRelativeTo(null);
		jd6.setUndecorated(true);
		jd6.setLayout(null);
		jd6.setLocation(gameFrame.getLocationOnScreen().x + 150,
				gameFrame.getLocationOnScreen().y + 32);

		JLabel jl = new JLabel(new String("当前题目:"));

		jl.setBounds(10, 2, 100, 30);
		JLabel jl1 = new JLabel(new String("游戏人数:"));
		jl1.setBounds(200, 2, 300, 30);
		jd6.add(jl);
		jd6.add(jl1);

		jd6.setVisible(true);

	}

	private void addWC() {
		jd5 = new JDialog(gameFrame, false);
		jd5.setSize(130, 230);
		jd5.setResizable(false);
		jd5.setLocationRelativeTo(null);
		jd5.setUndecorated(true);
		jd5.setLocation(gameFrame.getLocationOnScreen().x + 8,
				gameFrame.getLocationOnScreen().y + 380);
		JTextArea ja = new JTextArea();
		ja.setLineWrap(true);
		JScrollPane js = new JScrollPane(ja);
		js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jd5.add(js);
		jd5.setVisible(true);

	}

	private void addABS() {
		jd4 = new JDialog(gameFrame, false);
		jd4.setSize(130, 300);
		jd4.setLocationRelativeTo(null);
		jd4.setResizable(false);
		jd4.setUndecorated(true);
		// jd4.getRootPane().setOpaque(false);

		jd4.setLocation(gameFrame.getLocationOnScreen().x + 8,
				gameFrame.getLocationOnScreen().y + 52);
		JTextArea ja = new JTextArea();
		ja.setLineWrap(true);
		JScrollPane js = new JScrollPane(ja);
		js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jd4.add(js);
		jd4.setVisible(true);

		jd4.setLayout(null);
	}

	private void addWBK() {
		jd3 = new JDialog(gameFrame, false);
		jd3.setSize(185, 50);
		jd3.setLocationRelativeTo(null);
		jd3.setResizable(false);
		jd3.setUndecorated(true);
		jd3.setLocation(gameFrame.getLocationOnScreen().x + 610,
				gameFrame.getLocationOnScreen().y + 450);
		JTextField jt = new JTextField();
		jt.setBounds(500, 550, 150, 30);

		jt.setOpaque(true);
		jd3.add(jt);
		jd3.setVisible(true);

	}

	private void addFS() {
		jd2 = new JDialog(gameFrame, false);
		jd2.setSize(80, 30);

		jd2.setResizable(false);
		jd2.setLocationRelativeTo(null);

		jd2.setLocation(gameFrame.getLocationOnScreen().x + 660,
				gameFrame.getLocationOnScreen().y + 510);

		JButton jb = new JButton("发送");
		jb.setBackground(Color.magenta);
		jd2.setUndecorated(true);
		jd2.add(jb);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("dddd");

			}
		});
		jd2.setVisible(true);

	}

	private void addJTF() {
		// 创建Jdialog
		jd = new JDialog(gameFrame, "", false);
		jd.setSize(190, 400);
		jd.setResizable(false);
		// jd.setLayout(new FlowLayout());
		// 设置JDialog的位置随面板拖动
		jd.setLocation(gameFrame.getLocationOnScreen().x + 608,
				gameFrame.getLocationOnScreen().y + 30);
		// 在JLabel中加背景图片
		JLabel jl = new JLabel(new ImageIcon("img/bg副.jpg"));
		jl.setBounds(0, 0, 200, 400);
		// 添加文本域
		JTextArea jt = new JTextArea();
		jt.setBounds(0, 0, 200, 400);
		jt.setLineWrap(true);
		JScrollPane js = new JScrollPane(jt);

		js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jt.setOpaque(false);
		jd.setUndecorated(true);
		jl.setLayout(null);
		jd.add(jl);
		jl.add(jt);
		jt.add(js);
		// jd.add(jb);
		jd.setVisible(true);

	}

	@Override
	public void bufferedPaint(Graphics graphics) {
		// 面板背景颜色
		graphics.setColor(Color.pink);
		graphics.fillRect(0, 0, 800, 600);

		// 玩家列表颜色和大小
		graphics.setColor(Color.orange);
		graphics.fillRect(5, 5, 130, 20);
		// graphics.fillRect(5, 330, 130, 25);
		graphics.fillRoundRect(5, 330, 130, 25, 10, 10);
		graphics.setColor(Color.green);
		graphics.fillRect(220, 53, 250, 60);
		graphics.setColor(Color.red);
		graphics.fillRect(150, 52, 60, 60);
		// 设置字体
		Font font = new Font("楷体", Font.BOLD, 14);
		graphics.setFont(font);
		graphics.setColor(Color.black);
		graphics.drawString("玩家列表", 45, 20);
		graphics.drawString("房间动态", 45, 349);
		graphics.drawString("一轮后请选择您认为是卧底的人!", 220, 70);
		Font font1 = new Font("楷体", Font.BOLD, 24);
		graphics.setFont(font1);
		graphics.setColor(Color.yellow);
		graphics.drawString("自杀", 155, 90);

	}

}
