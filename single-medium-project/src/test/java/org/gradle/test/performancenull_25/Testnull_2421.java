package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2421 {
    private final Productionnull_2421 production = new Productionnull_2421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}