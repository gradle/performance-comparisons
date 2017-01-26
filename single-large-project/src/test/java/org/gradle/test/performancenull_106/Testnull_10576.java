package org.gradle.test.performancenull_106;

import static org.junit.Assert.*;

public class Testnull_10576 {
    private final Productionnull_10576 production = new Productionnull_10576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}