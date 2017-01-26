package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30072 {
    private final Productionnull_30072 production = new Productionnull_30072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}