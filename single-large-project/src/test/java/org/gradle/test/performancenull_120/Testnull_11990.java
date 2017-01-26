package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11990 {
    private final Productionnull_11990 production = new Productionnull_11990("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}