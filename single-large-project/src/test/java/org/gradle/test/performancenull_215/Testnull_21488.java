package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21488 {
    private final Productionnull_21488 production = new Productionnull_21488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}