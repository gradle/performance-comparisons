package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40454 {
    private final Productionnull_40454 production = new Productionnull_40454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}