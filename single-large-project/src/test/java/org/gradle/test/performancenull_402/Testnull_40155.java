package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40155 {
    private final Productionnull_40155 production = new Productionnull_40155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}