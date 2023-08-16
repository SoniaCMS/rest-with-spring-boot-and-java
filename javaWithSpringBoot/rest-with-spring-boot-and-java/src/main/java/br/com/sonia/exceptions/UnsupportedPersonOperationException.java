package br.com.sonia.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedPersonOperationException extends RuntimeException{

	public UnsupportedPersonOperationException(String ex) {
		super(ex);
	}

	private static final long serialVersionUID = 1L;
}
