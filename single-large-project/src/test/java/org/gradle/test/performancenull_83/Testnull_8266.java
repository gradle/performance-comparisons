package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8266 {
    private final Productionnull_8266 production = new Productionnull_8266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}