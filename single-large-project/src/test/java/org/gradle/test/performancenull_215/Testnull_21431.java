package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21431 {
    private final Productionnull_21431 production = new Productionnull_21431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}