package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46200 {
    private final Productionnull_46200 production = new Productionnull_46200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}