package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49500 {
    private final Productionnull_49500 production = new Productionnull_49500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}