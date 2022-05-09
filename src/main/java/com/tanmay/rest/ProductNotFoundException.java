package com.tanmay.rest;

public class ProductNotFoundException extends Exception {
	ProductNotFoundException(int id) {
	    super("Could not find Product " + id);
	  }
}
