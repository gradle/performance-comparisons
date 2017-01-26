package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30018 {
    private final Productionnull_30018 production = new Productionnull_30018("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}