package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37182 {
    private final Productionnull_37182 production = new Productionnull_37182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}