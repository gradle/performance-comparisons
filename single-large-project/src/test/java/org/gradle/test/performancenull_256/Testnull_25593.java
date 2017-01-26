package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25593 {
    private final Productionnull_25593 production = new Productionnull_25593("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}