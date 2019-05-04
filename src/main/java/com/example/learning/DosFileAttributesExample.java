package com.example.learning;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class DosFileAttributesExample {
	public static void main(String[] args) {
		DosFileAttributesExample attributes = new DosFileAttributesExample();
		try {
			attributes.dosAttributes();
			//attributes.setposix();
			attributes.getdirectorystream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getdirectorystream() throws IOException {
		Path dir = Paths.get("/reema/reema1");
		try (DirectoryStream<Path> stream = // use try with resources
		Files.newDirectoryStream(dir,"[ra]*")) { // so we don't have close()
		for (Path path : stream) // loop through the stream
		System.out.println("file name"+path.getFileName());
		}		
	}

	private void setposix() throws IOException {
		Path path = Paths.get("D:/test");
		Files.createFile(path);
		PosixFileAttributes posix = Files.readAttributes(path,
		PosixFileAttributes.class); // get the Posix type
		Set<PosixFilePermission> perms =PosixFilePermissions.fromString("rw"); // UNIX style
		Files.setPosixFilePermissions(path, perms); // set permissions
		System.out.println(posix.permissions());		
	}

	private void dosAttributes() throws IOException {
		Path path = Paths.get("D:/test3");
		Files.createFile(path); // create file
		Files.setAttribute(path, "dos:hidden", true); // set attribute
		Files.setAttribute(path, "dos:readonly", true); // another one
		DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class); // dos attributes
		System.out.println(dos.isHidden());
		System.out.println(dos.isReadOnly());
		Files.setAttribute(path, "dos:hidden", false);
		Files.setAttribute(path, "dos:readonly", false);
		dos = Files.readAttributes(path, DosFileAttributes.class); // get attributes again
		System.out.println(dos.isHidden());
		System.out.println(dos.isReadOnly());
		Files.delete(path);
	}
}
