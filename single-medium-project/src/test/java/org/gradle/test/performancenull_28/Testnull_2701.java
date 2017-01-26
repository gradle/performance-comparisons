package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2701 {
    private final Productionnull_2701 production = new Productionnull_2701("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}