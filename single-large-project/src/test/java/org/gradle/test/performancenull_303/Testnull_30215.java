package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30215 {
    private final Productionnull_30215 production = new Productionnull_30215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}