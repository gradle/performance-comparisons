package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18965 {
    private final Productionnull_18965 production = new Productionnull_18965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}