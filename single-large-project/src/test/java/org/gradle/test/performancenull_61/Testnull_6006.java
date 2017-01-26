package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6006 {
    private final Productionnull_6006 production = new Productionnull_6006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}