package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7497 {
    private final Productionnull_7497 production = new Productionnull_7497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}