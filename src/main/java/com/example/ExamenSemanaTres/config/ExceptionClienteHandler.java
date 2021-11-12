package com.example.ExamenSemanaTres.config;

import com.example.ExamenSemanaTres.controller.ClienteInexistenteEception;
import com.example.ExamenSemanaTres.entity.Prestamo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionClienteHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ClienteInexistenteEception.class})
    protected ResponseEntity<Object> handleNotFound(
            Exception ex, WebRequest request
    ){
        return handleExceptionInternal(ex," cliente no encontrado",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}


