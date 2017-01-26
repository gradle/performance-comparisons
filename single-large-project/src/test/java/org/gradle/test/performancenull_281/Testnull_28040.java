package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28040 {
    private final Productionnull_28040 production = new Productionnull_28040("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}