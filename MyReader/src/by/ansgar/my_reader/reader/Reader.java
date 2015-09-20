package by.ansgar.my_reader.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import ebook.*;
import ebook.parser.*;
import by.ansgar.my_reader.frame.MyReader;

public class Reader {

	private static BufferedReader reader = null;
	
	public static void readFile(String path) {
		
		try {
			reader = new BufferedReader(new FileReader(path));
			MyReader.windowArea.setText(null);
			
			while (reader.ready()) {
				String text = reader.readLine() + "\n";
				System.out.println(text);
				MyReader.windowArea.append(text);
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void readFB2(String path){
		
		Parser parser = new InstantParser();
		EBook ebook = parser.parse(path);
		
		if(ebook.isOk){
			MyReader.windowArea.append(ebook.annotation);
			
			System.out.println(ebook.annotation);
			System.out.println(ebook.doExtractCover);
			System.out.println(ebook.encoding);
			System.out.println(ebook.fileName);
			System.out.println(ebook.isOk);
			System.out.println(ebook.language);
			System.out.println(ebook.sequenceName);
			System.out.println(ebook.sequenceNumber);
			System.out.println(ebook.srcLanguage);
			System.out.println(ebook.title);
			System.out.println(ebook.authors);
			System.out.println(ebook.cover);
			System.out.println(ebook.epubGenres);
			System.out.println(ebook.fb2Genres);
			System.out.println(ebook.format);
			System.out.println(ebook.translators);
		}
		
	}

}
