package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23832 {
    private final Productionnull_23832 production = new Productionnull_23832("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}