package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21486 {
    private final Productionnull_21486 production = new Productionnull_21486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}