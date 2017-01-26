package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2778 {
    private final Productionnull_2778 production = new Productionnull_2778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}