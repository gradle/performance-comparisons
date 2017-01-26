package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21587 {
    private final Productionnull_21587 production = new Productionnull_21587("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}