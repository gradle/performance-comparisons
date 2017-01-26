package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40848 {
    private final Productionnull_40848 production = new Productionnull_40848("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}