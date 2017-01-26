package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25506 {
    private final Productionnull_25506 production = new Productionnull_25506("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}