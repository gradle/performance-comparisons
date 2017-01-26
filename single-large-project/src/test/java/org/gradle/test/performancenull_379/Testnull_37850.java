package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37850 {
    private final Productionnull_37850 production = new Productionnull_37850("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}