package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2762 {
    private final Productionnull_2762 production = new Productionnull_2762("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}