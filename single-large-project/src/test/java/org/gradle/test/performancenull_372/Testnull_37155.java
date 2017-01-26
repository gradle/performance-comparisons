package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37155 {
    private final Productionnull_37155 production = new Productionnull_37155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}