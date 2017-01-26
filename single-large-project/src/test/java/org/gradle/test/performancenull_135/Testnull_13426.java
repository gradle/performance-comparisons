package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13426 {
    private final Productionnull_13426 production = new Productionnull_13426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}