package by.ansgar.my_reader.service;

import by.ansgar.my_reader.reader.Reader;

/*
 * This class is for check what file we got
 * */

public class Service {

	public static void check(String file) {

		// file.replaceAll("/", "\\/");
		String path = file.replace("\\", "/");
//		System.out.println(path);
		String[] type = file.split("\\.");
		System.out.println(type[1]);
//		if (type[1] == "fb2") {
//			Reader.readFB2(path);
//		} else {
			Reader.readFile(path);
//		}
	}

}
