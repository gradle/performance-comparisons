package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17962 {
    private final Productionnull_17962 production = new Productionnull_17962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}