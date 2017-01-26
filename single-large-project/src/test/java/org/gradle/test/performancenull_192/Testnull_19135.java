package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19135 {
    private final Productionnull_19135 production = new Productionnull_19135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}