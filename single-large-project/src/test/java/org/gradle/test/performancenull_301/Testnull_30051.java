package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30051 {
    private final Productionnull_30051 production = new Productionnull_30051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}