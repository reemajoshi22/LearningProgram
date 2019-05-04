package com.example.learning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Date;

public class AbsoluteAndRelativePath {
	public static void main(String[] args) {
		AbsoluteAndRelativePath absoluteAndRelativePath=new AbsoluteAndRelativePath();
		try {
			absoluteAndRelativePath.getRelativizePath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getRelativizePath() throws IOException {
		Date januaryFirst = new Date();
		Path dir = Paths.get("/home/java");
		Path music = Paths.get("/home/java/country/Swift.mp3");
		Path mp3 = dir.relativize(music);
		System.out.println(mp3);
		Path path = Paths.get("/temp/file2");
		Files.createFile(path); // create another file
		FileTime fileTime = FileTime.fromMillis(januaryFirst.getTime()); // FileTime object
		Files.setLastModifiedTime(path, fileTime); // set time
		System.out.println(Files.getLastModifiedTime(path)); // get time
		Files.delete(path); // delete the
	}
}
