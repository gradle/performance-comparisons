package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38525 {
    private final Productionnull_38525 production = new Productionnull_38525("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}