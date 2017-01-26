package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7481 {
    private final Productionnull_7481 production = new Productionnull_7481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}