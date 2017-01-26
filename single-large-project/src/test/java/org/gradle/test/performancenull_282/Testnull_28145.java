package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28145 {
    private final Productionnull_28145 production = new Productionnull_28145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}