package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25560 {
    private final Productionnull_25560 production = new Productionnull_25560("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}