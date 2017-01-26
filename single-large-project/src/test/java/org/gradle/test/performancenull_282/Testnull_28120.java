package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28120 {
    private final Productionnull_28120 production = new Productionnull_28120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}