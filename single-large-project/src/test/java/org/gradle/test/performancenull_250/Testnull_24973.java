package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24973 {
    private final Productionnull_24973 production = new Productionnull_24973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}