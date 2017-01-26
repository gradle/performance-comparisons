package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18950 {
    private final Productionnull_18950 production = new Productionnull_18950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}