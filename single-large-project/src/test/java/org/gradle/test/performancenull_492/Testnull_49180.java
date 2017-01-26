package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49180 {
    private final Productionnull_49180 production = new Productionnull_49180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}