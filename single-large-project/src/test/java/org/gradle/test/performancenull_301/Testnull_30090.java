package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30090 {
    private final Productionnull_30090 production = new Productionnull_30090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}