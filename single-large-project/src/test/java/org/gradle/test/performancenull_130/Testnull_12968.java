package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12968 {
    private final Productionnull_12968 production = new Productionnull_12968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}