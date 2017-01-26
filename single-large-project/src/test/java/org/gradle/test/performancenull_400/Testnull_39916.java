package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39916 {
    private final Productionnull_39916 production = new Productionnull_39916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}