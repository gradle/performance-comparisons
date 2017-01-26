package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49421 {
    private final Productionnull_49421 production = new Productionnull_49421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}