package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22052 {
    private final Productionnull_22052 production = new Productionnull_22052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}