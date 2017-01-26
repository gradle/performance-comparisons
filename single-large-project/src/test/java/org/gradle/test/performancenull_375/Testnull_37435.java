package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37435 {
    private final Productionnull_37435 production = new Productionnull_37435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}