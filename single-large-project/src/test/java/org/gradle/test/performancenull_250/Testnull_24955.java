package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24955 {
    private final Productionnull_24955 production = new Productionnull_24955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}