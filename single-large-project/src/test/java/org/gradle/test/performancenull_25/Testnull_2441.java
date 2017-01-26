package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2441 {
    private final Productionnull_2441 production = new Productionnull_2441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}