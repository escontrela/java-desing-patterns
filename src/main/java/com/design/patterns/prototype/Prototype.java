package com.design.patterns.prototype;


/**
 * Prototype design pattern (GoF creational pattern)
 *
 * Create a new object based (coping) an existing one. Deep copy vs Shadow copy (by reference)
 *
 * Use when an object creation is expensive than clone it
 */
public abstract class Prototype implements Cloneable {

    public abstract Object copy() throws CloneNotSupportedException;

}