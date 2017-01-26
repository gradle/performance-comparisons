package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28082 {
    private final Productionnull_28082 production = new Productionnull_28082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}