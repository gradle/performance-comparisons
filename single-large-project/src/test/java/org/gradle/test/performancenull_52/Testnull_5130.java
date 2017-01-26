package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5130 {
    private final Productionnull_5130 production = new Productionnull_5130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}