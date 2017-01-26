package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32403 {
    private final Productionnull_32403 production = new Productionnull_32403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}