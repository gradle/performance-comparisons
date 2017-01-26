package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31173 {
    private final Productionnull_31173 production = new Productionnull_31173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}