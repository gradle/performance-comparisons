package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28128 {
    private final Productionnull_28128 production = new Productionnull_28128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}