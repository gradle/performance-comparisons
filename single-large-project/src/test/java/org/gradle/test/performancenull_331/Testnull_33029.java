package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33029 {
    private final Productionnull_33029 production = new Productionnull_33029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}