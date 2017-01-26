package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28141 {
    private final Productionnull_28141 production = new Productionnull_28141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}