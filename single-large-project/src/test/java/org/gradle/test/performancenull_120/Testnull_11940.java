package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11940 {
    private final Productionnull_11940 production = new Productionnull_11940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}