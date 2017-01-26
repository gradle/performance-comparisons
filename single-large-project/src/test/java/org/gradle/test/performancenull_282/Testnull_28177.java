package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28177 {
    private final Productionnull_28177 production = new Productionnull_28177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}