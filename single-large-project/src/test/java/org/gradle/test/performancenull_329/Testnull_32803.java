package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32803 {
    private final Productionnull_32803 production = new Productionnull_32803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}