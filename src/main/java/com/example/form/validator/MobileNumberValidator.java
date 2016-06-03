package com.example.form.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileNumberValidator implements ConstraintValidator<MobileNumber, String>{
	@Override
	public void initialize(MobileNumber number) {
	}

	@Override
	public boolean isValid(String mobileNumber, ConstraintValidatorContext ctx) {
		if(mobileNumber == null){
			return false;
		}
        if (mobileNumber.matches("\\d{10}")) return true;
        else if(mobileNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
        else if(mobileNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
        else if(mobileNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
        else return false;
	}
}
