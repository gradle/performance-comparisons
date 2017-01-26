package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7454 {
    private final Productionnull_7454 production = new Productionnull_7454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}