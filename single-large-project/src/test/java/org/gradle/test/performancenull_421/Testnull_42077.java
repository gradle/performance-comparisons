package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42077 {
    private final Productionnull_42077 production = new Productionnull_42077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}