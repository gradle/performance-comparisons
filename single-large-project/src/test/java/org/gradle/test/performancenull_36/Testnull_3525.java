package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3525 {
    private final Productionnull_3525 production = new Productionnull_3525("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}