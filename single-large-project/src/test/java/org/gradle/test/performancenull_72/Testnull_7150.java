package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7150 {
    private final Productionnull_7150 production = new Productionnull_7150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}