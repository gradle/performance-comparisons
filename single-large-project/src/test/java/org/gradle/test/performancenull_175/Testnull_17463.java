package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17463 {
    private final Productionnull_17463 production = new Productionnull_17463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}