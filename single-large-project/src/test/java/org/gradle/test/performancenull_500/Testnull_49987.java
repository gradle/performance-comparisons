package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49987 {
    private final Productionnull_49987 production = new Productionnull_49987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}