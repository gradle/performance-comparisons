package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28198 {
    private final Productionnull_28198 production = new Productionnull_28198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}