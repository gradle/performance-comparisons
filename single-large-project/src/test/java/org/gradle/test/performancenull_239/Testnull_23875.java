package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23875 {
    private final Productionnull_23875 production = new Productionnull_23875("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}