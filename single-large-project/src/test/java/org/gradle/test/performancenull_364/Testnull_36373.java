package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36373 {
    private final Productionnull_36373 production = new Productionnull_36373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}