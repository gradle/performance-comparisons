package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21155 {
    private final Productionnull_21155 production = new Productionnull_21155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}