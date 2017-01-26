package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46180 {
    private final Productionnull_46180 production = new Productionnull_46180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}