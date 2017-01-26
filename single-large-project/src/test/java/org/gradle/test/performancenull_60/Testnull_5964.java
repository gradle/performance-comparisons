package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5964 {
    private final Productionnull_5964 production = new Productionnull_5964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}