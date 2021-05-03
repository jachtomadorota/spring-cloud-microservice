package com.dorotajachtoma.eagleeye_licensing_service;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class License {

    private String id;

    private String productName;

    private String licenceType;

    private String organizationId;


}
