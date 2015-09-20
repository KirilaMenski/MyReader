package by.ansgar.my_reader.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import by.ansgar.my_reader.action.ActionButtons;

public class MyReader extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

	public static final String TITLE = "MyReader v. 0.1";
	public static final int WIDTH = size.width;
	public static final int HEIGHT = size.height;

	private JPanel panel, window;
	private JMenuBar menuBar;
	public static JMenu menu, newFile;
	public static JMenuItem openFile, close;
	public static JTextArea windowArea;
	private JScrollPane windowScroll;

	public MyReader() {
		panel = new JPanel();

		setTitle(TITLE);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);

		add(panel);
		panel.setLayout(null);

		addComponent();
	}

	public void addComponent() {

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 150, 25);

		menu = new JMenu("װאיכ");

		newFile = new JMenu("ֽמגû פאיכ");
		menu.add(newFile);

		openFile = new JMenuItem("ְהקûם³צü פאיכ");
		newFile.add(openFile);
		openFile.addActionListener(new ActionButtons());

		menu.addSeparator();

		close = new JMenuItem("ֲûיסצ³");
		close.addActionListener(new ActionButtons());
		menu.add(close);
		menuBar.add(menu);

		window = new JPanel();
		window.setLayout(null);
		window.setBounds(0, 0, WIDTH, HEIGHT - 50);

		windowArea = new JTextArea();
		windowArea.setLineWrap(true);
		windowArea.setWrapStyleWord(true);

		windowScroll = new JScrollPane(windowArea,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		windowScroll.setBounds(5, 30, WIDTH - 10, HEIGHT - 60);
		window.add(windowScroll);

		panel.add(menuBar);
		panel.add(window);
		panel.updateUI();
	}

}
