package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34409 {
    private final Productionnull_34409 production = new Productionnull_34409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}