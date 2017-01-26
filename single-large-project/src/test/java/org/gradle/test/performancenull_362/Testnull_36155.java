package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36155 {
    private final Productionnull_36155 production = new Productionnull_36155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}