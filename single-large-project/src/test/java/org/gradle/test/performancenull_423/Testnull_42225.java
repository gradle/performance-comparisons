package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42225 {
    private final Productionnull_42225 production = new Productionnull_42225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}