package com.Dream11.Dream11.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException  {


     @ExceptionHandler(ResourceNotFound.class)
      ResponseEntity<ResourceNotFound> resourceNotFoundResponseEntity(ResourceNotFound res)
      {
          ResourceNotFound s = new ResourceNotFound("Something Went Wrong");
          return new ResponseEntity<ResourceNotFound>(s, HttpStatus.NOT_FOUND);
      }
}
