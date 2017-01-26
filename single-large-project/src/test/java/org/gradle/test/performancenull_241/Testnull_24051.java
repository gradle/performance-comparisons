package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24051 {
    private final Productionnull_24051 production = new Productionnull_24051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}