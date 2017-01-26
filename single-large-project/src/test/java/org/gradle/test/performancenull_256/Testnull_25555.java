package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25555 {
    private final Productionnull_25555 production = new Productionnull_25555("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}