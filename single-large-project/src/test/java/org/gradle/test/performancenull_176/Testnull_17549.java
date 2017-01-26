package org.gradle.test.performancenull_176;

import static org.junit.Assert.*;

public class Testnull_17549 {
    private final Productionnull_17549 production = new Productionnull_17549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}