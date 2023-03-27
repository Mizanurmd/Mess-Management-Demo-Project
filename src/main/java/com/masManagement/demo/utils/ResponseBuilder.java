package com.masManagement.demo.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;


import com.masManagement.demo.dto.ErrorResponseDto;
import com.masManagement.demo.dto.Response;

public final class ResponseBuilder {
	public ResponseBuilder() {}
	
	//////////// Create a response Builder here ///////////
	
	public static List<ErrorResponseDto> getCustomError(BindingResult result){
		List<ErrorResponseDto>dtoList = new ArrayList<>();
		result.getFieldErrors().forEach(fieldError ->{
			ErrorResponseDto dto = ErrorResponseDto.builder()
					.field(fieldError.getField())
					.message(fieldError.getDefaultMessage()).build();
					dtoList.add(dto);
			
		});
	
		return dtoList;
	}
	
/////////// Create fail Response here
public static Response getFailResponse(HttpStatus status, String message) {
	return Response.builder()
		.message(message)
		.status(status.getReasonPhrase())
		.statusCode(status.value())
		.timestamp(new Date().getTime()).build();
	
}

}
