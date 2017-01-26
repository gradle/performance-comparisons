package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6373 {
    private final Productionnull_6373 production = new Productionnull_6373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}