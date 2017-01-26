package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38485 {
    private final Productionnull_38485 production = new Productionnull_38485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}