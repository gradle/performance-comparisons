package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20549 {
    private final Productionnull_20549 production = new Productionnull_20549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}