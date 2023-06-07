package com.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class JavaValidationError {

	private String name ;

    @NotNull
    private Double value;

    @AssertTrue
    public boolean isDoubleCustomValid() { 
    if( (Objects.isNull(value)  ) {
           return value == 1 || value == 100;  
    } 
    return true;
}
    

}
