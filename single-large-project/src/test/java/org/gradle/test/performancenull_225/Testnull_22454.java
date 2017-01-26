package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22454 {
    private final Productionnull_22454 production = new Productionnull_22454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}