/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author yunak
 */
public class Elk extends Animal{
    /**
     * constructor that sets the name of the elk
     * @param name for the elk
     */
    public Elk(String name) {
        super(name);
    }

    /**
     * overriden from Animal class
     * print how an elk sounds.
     */
    @Override
    public void sound() {
        System.out.println(name + " bugles.");
    }

    /**
     * overriden from Animal class
     * print how an elk plays
     */
    @Override
    public void play() {
        System.out.println(name + " lumbers across a high way.");
    }
}
