package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2342 {
    private final Productionnull_2342 production = new Productionnull_2342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}