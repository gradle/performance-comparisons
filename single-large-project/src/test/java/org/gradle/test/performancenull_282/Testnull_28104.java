package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28104 {
    private final Productionnull_28104 production = new Productionnull_28104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}