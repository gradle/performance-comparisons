package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5782 {
    private final Productionnull_5782 production = new Productionnull_5782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}