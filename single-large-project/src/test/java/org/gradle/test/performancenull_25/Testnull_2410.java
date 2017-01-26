package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2410 {
    private final Productionnull_2410 production = new Productionnull_2410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}