package com.work.sri.sri_app.application;


import com.work.sri.sri_app.dto.ProductDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



@Service
public class MyService {

    /*HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.
            set("Access-Control-Allow-Origin","*");*/
    //responseHeaders.set("MyResponseHeader", "MyValue");
    public ResponseEntity<List<ProductDto>> getProducts() {
        List<ProductDto> productDtoList = new LinkedList<>();
        ProductDto productDto = new ProductDto("Srivathsan",25,"B.Tech","OnSite",4.5);
        ProductDto productDto1 = new ProductDto("Mani",22,"B.E","offsite",3.5);
        System.out.println("Coming Here:::" + productDto.getName());
        productDtoList.add(productDto);
        productDtoList.add(productDto1);


        return new ResponseEntity<List<ProductDto>>(productDtoList, HttpStatus.CREATED)
                /*header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
                .header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").build()*/;
    }
}
