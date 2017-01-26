package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6362 {
    private final Productionnull_6362 production = new Productionnull_6362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}