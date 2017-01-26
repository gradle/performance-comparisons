package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30036 {
    private final Productionnull_30036 production = new Productionnull_30036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}