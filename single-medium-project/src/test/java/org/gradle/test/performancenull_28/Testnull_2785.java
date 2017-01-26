package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2785 {
    private final Productionnull_2785 production = new Productionnull_2785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}