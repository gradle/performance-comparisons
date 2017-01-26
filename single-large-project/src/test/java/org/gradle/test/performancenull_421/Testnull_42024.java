package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42024 {
    private final Productionnull_42024 production = new Productionnull_42024("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}