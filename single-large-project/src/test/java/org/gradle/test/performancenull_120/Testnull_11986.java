package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11986 {
    private final Productionnull_11986 production = new Productionnull_11986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}