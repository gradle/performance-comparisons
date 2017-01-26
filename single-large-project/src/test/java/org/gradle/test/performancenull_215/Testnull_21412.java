package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21412 {
    private final Productionnull_21412 production = new Productionnull_21412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}