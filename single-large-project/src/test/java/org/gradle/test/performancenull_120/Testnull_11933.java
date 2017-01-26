package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11933 {
    private final Productionnull_11933 production = new Productionnull_11933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}