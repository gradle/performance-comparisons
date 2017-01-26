package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31062 {
    private final Productionnull_31062 production = new Productionnull_31062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}