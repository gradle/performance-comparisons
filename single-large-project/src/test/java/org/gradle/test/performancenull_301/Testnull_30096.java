package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30096 {
    private final Productionnull_30096 production = new Productionnull_30096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}