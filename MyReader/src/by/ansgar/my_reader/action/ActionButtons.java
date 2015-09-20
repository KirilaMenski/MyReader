package by.ansgar.my_reader.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

import by.ansgar.my_reader.frame.MyReader;
import by.ansgar.my_reader.service.Service;

public class ActionButtons implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == MyReader.openFile){
			JFileChooser chooser = new JFileChooser();
			 int ret = chooser.showDialog(null, "Открыть файл");     
             if (ret == JFileChooser.APPROVE_OPTION) {
                 File file = chooser.getSelectedFile();
                 Service.check(file.toString());

//                 label.setText(file.getName());
             }
		}
		
		if(e.getSource() == MyReader.close){
			System.exit(0);
		}
		
	}

}
