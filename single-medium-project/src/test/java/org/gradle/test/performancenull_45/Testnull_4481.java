package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4481 {
    private final Productionnull_4481 production = new Productionnull_4481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}