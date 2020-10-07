package com.hackerrank.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee{
  @Id
  private Long id;
  private String name;
  public Employee(){}
  public Employee(Long is,String name){
    this.id=id;
    this.name=name;
  }
  public Long getId(){
    return this.id;
  }
  public String getName(){
    return this.name;
  }
  public void setId(){
    this.id=id;
  }
  public void setName(){
    this.name=name;
  }
}