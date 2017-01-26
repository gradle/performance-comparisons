package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2468 {
    private final Productionnull_2468 production = new Productionnull_2468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}