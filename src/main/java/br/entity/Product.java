package br.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product implements Serializable{
  
  private Long id;
  private String name;
  private String description;

}
