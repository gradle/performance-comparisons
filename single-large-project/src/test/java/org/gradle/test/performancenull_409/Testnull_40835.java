package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40835 {
    private final Productionnull_40835 production = new Productionnull_40835("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}