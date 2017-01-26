package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3587 {
    private final Productionnull_3587 production = new Productionnull_3587("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}