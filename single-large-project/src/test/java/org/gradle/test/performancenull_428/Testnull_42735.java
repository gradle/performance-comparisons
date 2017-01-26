package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42735 {
    private final Productionnull_42735 production = new Productionnull_42735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}