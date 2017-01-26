package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40851 {
    private final Productionnull_40851 production = new Productionnull_40851("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}