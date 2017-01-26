package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49454 {
    private final Productionnull_49454 production = new Productionnull_49454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}