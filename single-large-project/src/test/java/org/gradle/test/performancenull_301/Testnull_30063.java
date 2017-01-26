package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30063 {
    private final Productionnull_30063 production = new Productionnull_30063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}