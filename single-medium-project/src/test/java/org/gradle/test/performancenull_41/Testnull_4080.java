package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4080 {
    private final Productionnull_4080 production = new Productionnull_4080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}