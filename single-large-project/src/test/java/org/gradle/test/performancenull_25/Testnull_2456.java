package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2456 {
    private final Productionnull_2456 production = new Productionnull_2456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}