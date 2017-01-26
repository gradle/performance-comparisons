package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25513 {
    private final Productionnull_25513 production = new Productionnull_25513("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}