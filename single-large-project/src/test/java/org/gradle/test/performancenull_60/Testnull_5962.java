package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5962 {
    private final Productionnull_5962 production = new Productionnull_5962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}