package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4454 {
    private final Productionnull_4454 production = new Productionnull_4454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}