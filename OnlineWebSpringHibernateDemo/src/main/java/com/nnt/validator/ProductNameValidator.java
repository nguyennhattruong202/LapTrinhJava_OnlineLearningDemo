/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnt.validator;

import com.nnt.pojos.Product;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductNameValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Product.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Product product = (Product) o;
        if (!product.getName().contains("NNT")) {
            errors.rejectValue("name", "product.name.containError");
        }
    }

}
