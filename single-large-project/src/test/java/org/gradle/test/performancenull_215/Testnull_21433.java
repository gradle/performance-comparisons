package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21433 {
    private final Productionnull_21433 production = new Productionnull_21433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}