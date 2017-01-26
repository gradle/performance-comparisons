package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7461 {
    private final Productionnull_7461 production = new Productionnull_7461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}