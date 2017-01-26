package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6458 {
    private final Productionnull_6458 production = new Productionnull_6458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}