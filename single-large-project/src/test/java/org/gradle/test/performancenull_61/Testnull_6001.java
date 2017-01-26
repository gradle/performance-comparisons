package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6001 {
    private final Productionnull_6001 production = new Productionnull_6001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}