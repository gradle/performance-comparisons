package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33098 {
    private final Productionnull_33098 production = new Productionnull_33098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}