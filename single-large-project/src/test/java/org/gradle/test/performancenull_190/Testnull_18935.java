package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18935 {
    private final Productionnull_18935 production = new Productionnull_18935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}