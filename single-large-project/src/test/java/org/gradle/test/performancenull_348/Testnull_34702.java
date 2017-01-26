package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34702 {
    private final Productionnull_34702 production = new Productionnull_34702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}