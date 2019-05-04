package com.example.learning;

import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Snippet {
	public static void main(String[] args) {
		Snippet snippet = new Snippet();
		snippet.preVisitDirectory(Paths.get("/home/emptyChild"),null);
		snippet.matchpath();
	}

	private void matchpath() {
		Path path1 = Paths.get("/home/One.txt");
		Path path2 = Paths.get("One.txt");
		PathMatcher matcher = FileSystems.getDefault() .getPathMatcher( "glob:*.txt"); // wait. What's a glob?
		System.out.println(matcher.matches(path1));
		System.out.println(matcher.matches(path2));		
	}

	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("pre: " + dir);
		String name = dir.getFileName().toString();
		if (name.equals("grandchild"))
			return FileVisitResult.SKIP_SUBTREE;
		if (name.equals("emptyChild"))
			return FileVisitResult.SKIP_SIBLINGS;
		return FileVisitResult.CONTINUE;
	}
}
