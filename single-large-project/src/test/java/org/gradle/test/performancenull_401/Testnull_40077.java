package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40077 {
    private final Productionnull_40077 production = new Productionnull_40077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}