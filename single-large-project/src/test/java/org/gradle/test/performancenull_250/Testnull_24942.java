package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24942 {
    private final Productionnull_24942 production = new Productionnull_24942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}