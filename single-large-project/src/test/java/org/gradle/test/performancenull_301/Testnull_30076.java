package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30076 {
    private final Productionnull_30076 production = new Productionnull_30076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}