package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5933 {
    private final Productionnull_5933 production = new Productionnull_5933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}