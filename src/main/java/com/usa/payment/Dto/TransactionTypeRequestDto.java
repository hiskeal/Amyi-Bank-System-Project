package com.usa.payment.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionTypeRequestDto {

    private String description;

    private String type;

}
