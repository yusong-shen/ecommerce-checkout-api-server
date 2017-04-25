package io.swagger.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends ApiException {
	private int code;
	public NotFoundException (int code, String msg) {
		super(404, msg);
		this.code = code;
	}
}
