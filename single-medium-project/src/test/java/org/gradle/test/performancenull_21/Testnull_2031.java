package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2031 {
    private final Productionnull_2031 production = new Productionnull_2031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}