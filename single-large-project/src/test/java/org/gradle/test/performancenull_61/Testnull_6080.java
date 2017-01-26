package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6080 {
    private final Productionnull_6080 production = new Productionnull_6080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}