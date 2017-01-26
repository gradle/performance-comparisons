package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20386 {
    private final Productionnull_20386 production = new Productionnull_20386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}