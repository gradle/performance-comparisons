package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19175 {
    private final Productionnull_19175 production = new Productionnull_19175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}