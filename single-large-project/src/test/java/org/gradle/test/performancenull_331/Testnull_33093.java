package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33093 {
    private final Productionnull_33093 production = new Productionnull_33093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}