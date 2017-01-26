package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2024 {
    private final Productionnull_2024 production = new Productionnull_2024("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}