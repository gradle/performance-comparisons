package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24934 {
    private final Productionnull_24934 production = new Productionnull_24934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}