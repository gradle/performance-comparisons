package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32458 {
    private final Productionnull_32458 production = new Productionnull_32458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}