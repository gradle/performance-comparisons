package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30095 {
    private final Productionnull_30095 production = new Productionnull_30095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}