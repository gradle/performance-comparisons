package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20587 {
    private final Productionnull_20587 production = new Productionnull_20587("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}