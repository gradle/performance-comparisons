package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29926 {
    private final Productionnull_29926 production = new Productionnull_29926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}