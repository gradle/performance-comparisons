package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12073 {
    private final Productionnull_12073 production = new Productionnull_12073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}