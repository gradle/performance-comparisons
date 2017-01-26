package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17403 {
    private final Productionnull_17403 production = new Productionnull_17403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}