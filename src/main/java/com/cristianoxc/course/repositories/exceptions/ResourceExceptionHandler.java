package com.cristianoxc.course.repositories.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cristianoxc.course.services.exceptions.ResourceNotFoundException;

//O ControllerAdvice serve para interceptar as exceções que acontecerem
@ControllerAdvice
public class ResourceExceptionHandler {

	/* 
	 * isso aqui significa que o metodo resourceNotFound vai interceptar qualquer exceção 
	 * do tipo ResourceNotFoundException e fazer o tratamento.
	 */
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		//o StandardError serve para montar um corpo para a mensagem de resposta.
		StandardError erro = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(erro);
	}
}
