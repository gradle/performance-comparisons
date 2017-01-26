package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21543 {
    private final Productionnull_21543 production = new Productionnull_21543("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}