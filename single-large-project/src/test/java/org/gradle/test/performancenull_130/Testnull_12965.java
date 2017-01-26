package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12965 {
    private final Productionnull_12965 production = new Productionnull_12965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}