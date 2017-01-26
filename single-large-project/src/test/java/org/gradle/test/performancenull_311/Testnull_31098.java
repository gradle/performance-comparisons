package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31098 {
    private final Productionnull_31098 production = new Productionnull_31098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}