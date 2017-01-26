package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30047 {
    private final Productionnull_30047 production = new Productionnull_30047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}