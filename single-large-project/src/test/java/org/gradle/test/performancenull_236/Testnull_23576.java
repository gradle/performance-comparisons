package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23576 {
    private final Productionnull_23576 production = new Productionnull_23576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}