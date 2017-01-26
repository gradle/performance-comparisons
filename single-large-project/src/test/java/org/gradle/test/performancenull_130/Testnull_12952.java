package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12952 {
    private final Productionnull_12952 production = new Productionnull_12952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}