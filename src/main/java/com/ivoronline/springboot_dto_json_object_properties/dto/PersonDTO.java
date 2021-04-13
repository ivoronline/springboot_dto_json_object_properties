package com.ivoronline.springboot_dto_json_object_properties.dto;

public class PersonDTO {

  //PROPERTIES
  //Properties are used for Deserialization if there are no Setters or Constructor.
  //Jackson uses reflection to access private Properties.
  public String  name;
  public Integer age;

}
