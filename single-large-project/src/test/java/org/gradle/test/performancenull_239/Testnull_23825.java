package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23825 {
    private final Productionnull_23825 production = new Productionnull_23825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}