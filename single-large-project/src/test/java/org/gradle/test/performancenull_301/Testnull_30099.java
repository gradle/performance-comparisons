package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30099 {
    private final Productionnull_30099 production = new Productionnull_30099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}