package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2475 {
    private final Productionnull_2475 production = new Productionnull_2475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}