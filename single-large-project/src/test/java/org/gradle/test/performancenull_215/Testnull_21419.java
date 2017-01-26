package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21419 {
    private final Productionnull_21419 production = new Productionnull_21419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}