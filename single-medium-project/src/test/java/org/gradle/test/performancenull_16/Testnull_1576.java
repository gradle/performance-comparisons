package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1576 {
    private final Productionnull_1576 production = new Productionnull_1576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}