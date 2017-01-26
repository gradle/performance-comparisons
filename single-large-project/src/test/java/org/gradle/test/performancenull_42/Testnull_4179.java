package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4179 {
    private final Productionnull_4179 production = new Productionnull_4179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}