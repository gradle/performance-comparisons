package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_105 {
    private final Productionnull_105 production = new Productionnull_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}