package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40822 {
    private final Productionnull_40822 production = new Productionnull_40822("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}