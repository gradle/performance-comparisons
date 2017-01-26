package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2578 {
    private final Productionnull_2578 production = new Productionnull_2578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}