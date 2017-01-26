package org.gradle.test.performancenull_87;

import static org.junit.Assert.*;

public class Testnull_8601 {
    private final Productionnull_8601 production = new Productionnull_8601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}