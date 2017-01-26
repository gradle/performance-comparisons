package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7962 {
    private final Productionnull_7962 production = new Productionnull_7962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}