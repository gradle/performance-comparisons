package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3933 {
    private final Productionnull_3933 production = new Productionnull_3933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}