package pl.bykowski.springbootvalidate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
@ResponseStatus(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED)
public class IdNotFoundException extends RuntimeException{

  public IdNotFoundException(String message) {
    super(message);
  }
}
