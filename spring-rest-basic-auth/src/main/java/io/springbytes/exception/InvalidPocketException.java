package io.springbytes.exception;

public class InvalidPocketException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public InvalidPocketException(String message) {
        super(message);
    }
}
