package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope(value="prototype")
public class Laptop {

    private int ram;
    private String name;

    public Laptop() {
		super();
		System.out.println("laptop created..");
	}

    public int getram() { return ram; }
    public void setram(int ram) {this.ram = ram;}

    public String getname() { return name; }
    public void setname(String name) {this.name = name;}

    void show(){System.out.println("in class laptop");}

}
