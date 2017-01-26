package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22446 {
    private final Productionnull_22446 production = new Productionnull_22446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}