package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37848 {
    private final Productionnull_37848 production = new Productionnull_37848("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}