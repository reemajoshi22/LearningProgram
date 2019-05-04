package com.example.learning;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class RemoveClassFiles extends SimpleFileVisitor<Path> { 
	public FileVisitResult visitFile( Path file, BasicFileAttributes attrs) throws IOException {
		if (file.getFileName().endsWith(".class"))
			Files.delete(file); // delete the file
		return FileVisitResult.CONTINUE; // go on to next file
	}

	public static void main(String[] args) throws Exception {
		RemoveClassFiles dirs = new RemoveClassFiles();
		Files.walkFileTree(Paths.get("/reema/reema1"),dirs); // the visitor
	}
}
