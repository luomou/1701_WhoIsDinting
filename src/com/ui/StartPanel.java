package com.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.hx.socket.ClientThread;
import com.thread.SSWDFrameThread;
import com.tw.BasePanel;
import com.tw.Dynamiclmage;

public class StartPanel extends BasePanel {

	public StartPanel(JFrame gameFrame) {
		super(gameFrame);

	}

	Dynamiclmage dl = new Dynamiclmage("img/sy.jpg", 0, 0, 800, 600);
	Dynamiclmage au = new Dynamiclmage("img/按钮.png", 180, 0, 100, 40);
	Dynamiclmage au1 = new Dynamiclmage("img/按钮.png", 510, 0, 100, 40);
	Dynamiclmage au2 = new Dynamiclmage("img/an.png", 320, 340, 100, 40);

	@Override
	public void bufferedPaint(Graphics graphics) {
		Font font = new Font("楷体", Font.BOLD, 14);
		graphics.setFont(font);

		dl.draw(graphics);
		au.draw(graphics);
		au1.draw(graphics);
		au2.draw(graphics);
		graphics.drawString("服务端", 210, 23);
		graphics.drawString("客户端", 540, 23);
		graphics.drawString("游戏规则", 340, 365);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		if (x >= 190 && x <= 270 && y >= 10 && y <= 33) {
			showCreate();
		} else if (x >= 520 && x <= 600 && y >= 10 && y <= 33) {
			showJoin();
		}
		if (x >= 325 && x <= 415 && y >= 345 && y <= 375) {
			showHelp();
		}
	}

	private void showHelp() {
		JDialog jd = new JDialog(gameFrame, true);
		jd.setSize(800, 600);
		jd.setResizable(false);
		jd.setLocationRelativeTo(null);
		// 在JDialog中添加图片
		JLabel jl = new JLabel(new ImageIcon("img/gz.png"));
		// 设置大小
		jl.setBounds(0, 0, 780, 550);
		JLabel jlbel = new JLabel("我知道了");

		jlbel.setBounds(350, 500, 110, 80);

		jd.add(jl);
		jl.add(jlbel);
		jd.setVisible(true);
	}

	private void showCreate() {

		final JDialog jd = new JDialog(gameFrame, true);
		jd.setSize(500, 400);
		jd.setLocationRelativeTo(null);
		jd.setResizable(false);
		// 添加JLabel框
		JLabel jl = new JLabel(new ImageIcon("img/bg.jpg"));
		// 设置大小
		jl.setBounds(0, 0, 750, 450);
		JLabel jlabel = new JLabel(new String("端口号"));

		jlabel.setBounds(40, 15, 50, 30);
		// 设置JTextField框
		final JTextField jt = new JTextField(10);
		jt.setText("8888");
		jt.setBounds(90, 20, 120, 22);

		jt.setOpaque(false);
		JLabel jlabel1 = new JLabel(new String("端口号"));

		jlabel1.setBounds(250, 15, 50, 30);
		final JTextField jt1 = new JTextField(10);
		jt1.setText("9999");
		jt1.setBounds(300, 20, 120, 22);
		jt1.setOpaque(false);
		final JLabel name = new JLabel(new String("昵  称："));

		name.setBounds(128, 198, 50, 30);
		JTextField js = new JTextField(10);
		js.setText("发广告");
		js.setBounds(170, 200, 150, 22);
		js.setOpaque(false);

		Button button = new Button("登 录");
		button.setBackground(Color.lightGray);
		button.setBounds(180, 240, 50, 30);
		Button button1 = new Button("注 册");
		button1.setBackground(Color.lightGray);
		button1.setBounds(250, 240, 50, 30);

		// jt.setBorder(BorderFactory.createTitledBorder("用户民"));
		// jt.setBorder(null);

		// js.setText("123");

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String p1 = jt1.getText();
				String p2 = jt.getText();
				String n = name.getText();
				// 创建服务器
				createServer(p1, p2);
				// 连接服务器
				connectServer("127.0.0.1", p1, p2, n);
				System.out.println("aaaa");
				jd.dispose();
				((SSWDFrame) gameFrame).showGame();

			}

			// 创建服务器
			private void createServer(final String p1, final String p2) {
				new Thread() {
					public void run() {
						try {
							ServerSocket ss = new ServerSocket(Integer
									.parseInt(p1));
							ServerSocket ss1 = new ServerSocket(Integer
									.parseInt(p2));

							while (true) {

								Socket socket1 = ss.accept();
								Socket socket2 = ss1.accept();

								SSWDFrameThread st = new SSWDFrameThread(
										socket1, socket2);
							}

						} catch (Exception e) {
							// TODO: handle exception
						}
					};
				}.start();

			}

			// 连接服务器
			private void connectServer(String ip, String p1, String p2,
					String name) {
				// 创建Socket对象
				try {
					Socket socket1 = new Socket(ip, Integer.parseInt(p2));
					Socket socket2 = new Socket(ip, Integer.parseInt(p2));
					GamePanel.ct = new ClientThread(socket1, socket2, name);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		jl.setLayout(null);
		// 设置组件
		jd.add(jl);
		jl.add(button);
		jl.add(button1);
		jl.add(jt);
		jl.add(jt1);
		jl.add(js);
		jl.add(jlabel);
		jl.add(jlabel1);
		jl.add(name);
		// 设置可见
		jd.setVisible(true);

	}

	// 客户端
	private void showJoin() {
		final JDialog jd = new JDialog(gameFrame, true);
		jd.setSize(500, 400);
		jd.setLocationRelativeTo(null);
		jd.setResizable(false);
		// 添加JLabel框
		JLabel jl = new JLabel(new ImageIcon("img/bg.jpg"));
		// 设置大小
		jl.setBounds(0, 0, 750, 450);
		JLabel jlabel = new JLabel(new String("账 号："));
		jlabel.setBounds(128, 148, 50, 30);
		JLabel jlabel1 = new JLabel(new String("密 码："));
		jlabel1.setBounds(128, 198, 50, 30);
		// 设置JTextField框
		JTextField jt = new JTextField(10);

		Button button = new Button("登 录");
		button.setBackground(Color.lightGray);
		button.setBounds(180, 240, 50, 30);
		Button button1 = new Button("注 册");
		button1.setBackground(Color.lightGray);
		button1.setBounds(250, 240, 50, 30);

		jt.setOpaque(false);
		// jt.setBorder(BorderFactory.createTitledBorder("用户民"));
		// jt.setBorder(null);
		// 设置大小
		jt.setBounds(170, 150, 150, 22);
		JPasswordField js = new JPasswordField(10);
		js.setBounds(170, 200, 150, 22);
		js.setOpaque(false);

		jl.setLayout(null);
		// 设置组件
		jd.add(jl);
		jl.add(button);
		jl.add(button1);
		jl.add(jt);
		jl.add(js);
		jl.add(jlabel);
		jl.add(jlabel1);
		// 设置可见
		jd.setVisible(true);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				((SSWDFrame) gameFrame).showGame();
				System.out.println("saaaa");
			}
		});

	}

}
