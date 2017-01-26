package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30155 {
    private final Productionnull_30155 production = new Productionnull_30155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}