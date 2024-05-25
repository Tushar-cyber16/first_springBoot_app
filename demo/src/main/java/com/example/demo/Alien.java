package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {

    private int aid;
    private String aname;
    @Autowired
    public Laptop laptop;

    public Alien() {
		super();
		System.out.println("object created..");
	}

    public int getaid() { return aid; }
    public void setaid(int aid) {this.aid = aid;}

    public String getaname() { return aname; }
    public void setaname(String aname) {this.aname = aname;}

    public void show() {
        // laptop.setram(4);
        System.out.println(laptop.getram());
        laptop.show();
        System.out.println("in show");
    }

}
