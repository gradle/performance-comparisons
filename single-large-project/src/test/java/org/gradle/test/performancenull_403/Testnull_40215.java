package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40215 {
    private final Productionnull_40215 production = new Productionnull_40215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}