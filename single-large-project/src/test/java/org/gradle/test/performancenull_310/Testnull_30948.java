package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30948 {
    private final Productionnull_30948 production = new Productionnull_30948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}