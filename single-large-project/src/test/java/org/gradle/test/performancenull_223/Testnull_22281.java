package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22281 {
    private final Productionnull_22281 production = new Productionnull_22281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}