/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group9.inventoryapp;

/**
 *
 * @author Bless Adanu
 *  * ID: 10888516
 */


public class EmptyCollectionException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Sets up this exception with an appropriate message.
     * @param collection the name of the collection
     */
    public EmptyCollectionException(String collection)
    {
        super("The " + collection + " is empty.");
    }
}
