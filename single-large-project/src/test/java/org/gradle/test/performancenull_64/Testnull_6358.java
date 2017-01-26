package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6358 {
    private final Productionnull_6358 production = new Productionnull_6358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}