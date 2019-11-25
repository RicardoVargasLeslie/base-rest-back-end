package com.imricki.project.domain.exception.handler;

import java.util.Date;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.imricki.project.domain.exception.response.ErrorMessageResponse;
import com.imricki.project.domain.exception.response.ResponseMessage;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

	@ExceptionHandler({ ConstraintViolationException.class, MethodArgumentNotValidException.class,
			IllegalArgumentException.class, IllegalStateException.class, InvalidFormatException.class })
	public ResponseEntity<ErrorMessageResponse> BadRequestException() {
		return new ResponseEntity<>(new ErrorMessageResponse(new Date(), ResponseMessage.BAD_REQUEST_MESSAGE,
				HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
	}

}
