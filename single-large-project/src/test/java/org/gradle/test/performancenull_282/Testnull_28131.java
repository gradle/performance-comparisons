package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28131 {
    private final Productionnull_28131 production = new Productionnull_28131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}