package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49173 {
    private final Productionnull_49173 production = new Productionnull_49173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}