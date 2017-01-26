package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43189 {
    private final Productionnull_43189 production = new Productionnull_43189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}