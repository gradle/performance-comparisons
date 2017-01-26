package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33092 {
    private final Productionnull_33092 production = new Productionnull_33092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}