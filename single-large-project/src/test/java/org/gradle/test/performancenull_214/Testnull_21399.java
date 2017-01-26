package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21399 {
    private final Productionnull_21399 production = new Productionnull_21399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}