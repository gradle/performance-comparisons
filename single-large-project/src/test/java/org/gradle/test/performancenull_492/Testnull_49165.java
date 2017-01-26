package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49165 {
    private final Productionnull_49165 production = new Productionnull_49165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}