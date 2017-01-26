package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46155 {
    private final Productionnull_46155 production = new Productionnull_46155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}