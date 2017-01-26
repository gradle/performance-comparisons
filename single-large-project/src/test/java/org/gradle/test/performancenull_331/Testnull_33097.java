package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33097 {
    private final Productionnull_33097 production = new Productionnull_33097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}