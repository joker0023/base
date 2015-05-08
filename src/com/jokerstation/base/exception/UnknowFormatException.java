package com.jokerstation.base.exception;

/**
 * 未知的图片格式Exception
 * @author Joker
 *
 */
public class UnknowFormatException extends RuntimeException {

	private static final long serialVersionUID = -5804353921822773660L;

	/**
	 * @param message 异常信息
	 */
	public UnknowFormatException(String message) {
		super(message);
	}

	/**
	 * @param message 异常信息
	 * @param cause 异常原因
	 */
	public UnknowFormatException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
