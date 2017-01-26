package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4716 {
    private final Productionnull_4716 production = new Productionnull_4716("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}