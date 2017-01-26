package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6354 {
    private final Productionnull_6354 production = new Productionnull_6354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}