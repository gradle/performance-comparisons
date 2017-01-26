package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21080 {
    private final Productionnull_21080 production = new Productionnull_21080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}