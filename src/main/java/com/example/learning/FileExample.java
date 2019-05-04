package com.example.learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileExample {
	public static void main(String[] args) {
		boolean newfile = false;
		File file = new File("reema.txt");
		System.out.println(newfile);
		System.out.println(file.exists());
		try {
			newfile = file.createNewFile();
			System.out.println(newfile);
			System.out.println(file.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileExample example = new FileExample();
		example.filewriter();
		example.printWriter();
		example.bufferedWriter();
		example.makeDirectory();
		example.search();
		example.getpath();
		example.pathexample();
		example.cpymovedelte();
		example.pathEx();
		example.createpath();
		example.resolvepath();
		example.relativeze();
	}

	private void relativeze() {
		Path absolute1 = Paths.get("/home/java");
		Path absolute2 = Paths.get("/usr/local");
		Path absolute3 = Paths.get("/home/java/temp/music.mp3");
		Path relative1 = Paths.get("temp");
		Path relative2 = Paths.get("temp/music.pdf");
		System.out.println("1: " + absolute1.relativize(absolute3));
		System.out.println("2: " + absolute3.relativize(absolute1));
		System.out.println("3: " + absolute1.relativize(absolute2));
		System.out.println("4: " + relative1.relativize(relative2));
		System.out.println("5: " + absolute1.relativize(relative1));//BAD		
	}

	private void resolvepath() {
		Path absolute = Paths.get("/home/java");
		Path relative = Paths.get("dir");
		Path file = Paths.get("Model.pdf");
		System.out.println("1: " + absolute.resolve(relative));
		System.out.println("2: " + absolute.resolve(file));
		System.out.println("3: " + relative.resolve(file));
		System.out.println("4: " + relative.resolve(absolute)); // BAD
		System.out.println("5: " + file.resolve(absolute)); // BAD
		System.out.println("6: " + file.resolve(relative)); // BAD
	}

	private void createpath() {
		int spaces = 1;
		Path myPath = Paths.get("tmp", "dir1", "dir2", "dir3", "file.txt");
		for (Path subPath : myPath) {
			System.out.format("%" + spaces + "s%s%n", "", subPath);
			spaces += 2;
		}
	}

	private void pathEx() {
		Path path = Paths.get("C:/home/java/workspace");
		System.out.println("getFileName: " + path.getFileName());
		System.out.println("getName(1): " + path.getName(1));
		System.out.println("getNameCount: " + path.getNameCount());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getRoot: " + path.getRoot());
		System.out.println("subpath(0, 2): " + path.subpath(0, 2));
		System.out.println("toString: " + path.toString());
		System.out.println(Paths.get("/a/./b/./c").normalize());
		System.out.println(Paths.get(".classpath").normalize());
	}

	private void cpymovedelte() {
		Path source = Paths.get("./mini/mintin"); // exists
		Path target = Paths.get("/mini/test5.txt"); // doesn't yet exist
		System.out.println("relative" + source.resolve(target));
		try {
			Files.createDirectories(source);
			/*
			 * BasicFileAttributes basic = Files.readAttributes(target, // assume a valid
			 * path BasicFileAttributes.class); System.out.println("create: " +
			 * basic.creationTime()); System.out.println("access: " +
			 * basic.lastAccessTime()); System.out.println("modify: " +
			 * basic.lastModifiedTime()); System.out.println("directory: " +
			 * basic.isDirectory());
			 */
			BasicFileAttributes basic = Files.readAttributes(target, BasicFileAttributes.class); // attributes
			FileTime lastUpdated = basic.lastModifiedTime(); // get current
			FileTime created = basic.creationTime(); // values
			FileTime now = FileTime.fromMillis(System.currentTimeMillis());
			BasicFileAttributeView basicView = Files.getFileAttributeView(target, BasicFileAttributeView.class); // "view"
																												// this
																												// time
			basicView.setTimes(lastUpdated, now, created);
			Files.copy(source, target);
			/// Files.delete(target); // back to one copy
			// Files.move(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // now two copies of the file
	}

	private void pathexample() {
		Path path = Paths.get("/mini/mini");
		try {
			Files.createDirectories(path);
			Path path2 = Paths.get("/java/source/directory");
			Path file = Paths.get("/java/source/directory/Program.java");
			Files.createDirectories(path2); // create all levels of directories
			Files.createFile(file); // create file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getpath() {
		Path longer = FileSystems.getDefault() // get default file system
				.getPath("c:", "reema1");
		System.out.println(longer);
	}

	private void search() {
		String[] files = new String[100];
		File search = new File("directory");
		files = search.list(); // create the list
		for (String fn : files) // iterate through it
			System.out.println("found " + fn);
	}

	private void makeDirectory() {
		File file = new File("directory");
		file.mkdir();
		System.out.println(file.isDirectory());
		// file.delete();
		File file2 = new File(file, "firstfileindirectory.txt");
		try {
			file2.createNewFile();
			System.out.println(file2.isFile());
			// file2.delete();
			System.out.println(file2.isFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void bufferedWriter() {
		File file = new File("bufferedwriter.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("first line");
			bufferedWriter.write("second line");
			bufferedWriter.flush();
			bufferedWriter.close();
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			System.out.println(bufferedReader.readLine());
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void printWriter() {
		File file = new File("printwriter.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("first line");
			printWriter.println("second line");
			System.out.println("file path" + file.toPath());
			Path path = Paths.get("fileWrite1.txt"); // it's only an object
			System.out.println("file exists" + Files.exists(path)); // look for a real file
			Files.createFile(path); // create a file!
			System.out.println("check file" + Files.exists(path));
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void filewriter() {
		try {
			char[] charArray = new char[50];
			int size = 0;
			File file = new File("filewriter.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("first line \n second line");
			fileWriter.flush();
			fileWriter.close();
			System.out.println("written to file successfully");
			FileReader fileReader = new FileReader(file);
			size = fileReader.read(charArray);
			System.out.println("size" + size);
			for (char c : charArray) {
				System.out.println("read from file" + c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
