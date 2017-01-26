package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1764 {
    private final Productionnull_1764 production = new Productionnull_1764("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}