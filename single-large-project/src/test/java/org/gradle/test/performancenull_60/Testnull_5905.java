package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5905 {
    private final Productionnull_5905 production = new Productionnull_5905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}