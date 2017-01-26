package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25830 {
    private final Productionnull_25830 production = new Productionnull_25830("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}