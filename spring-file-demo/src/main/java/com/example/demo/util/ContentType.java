package com.example.demo.util;

import java.util.Arrays;

public enum ContentType {
	PDF("pdf"), XLSX("xlsx"), XLS("xls"), DOC("doc"), DOCS("docx");

	private String contentType;

	ContentType(String contentType) {
		this.contentType = contentType;
	}

	public static boolean getFileType(String contentType) {
		return Arrays.stream(ContentType.values()).filter(c -> c.contentType.equals(contentType)).findFirst().isPresent();
	}
}
