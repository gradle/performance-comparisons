package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30053 {
    private final Productionnull_30053 production = new Productionnull_30053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}