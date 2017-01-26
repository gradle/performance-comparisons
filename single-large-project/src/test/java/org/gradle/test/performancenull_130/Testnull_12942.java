package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12942 {
    private final Productionnull_12942 production = new Productionnull_12942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}