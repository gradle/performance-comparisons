package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11901 {
    private final Productionnull_11901 production = new Productionnull_11901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}