package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4937 {
    private final Productionnull_4937 production = new Productionnull_4937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}