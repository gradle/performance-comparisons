package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36217 {
    private final Productionnull_36217 production = new Productionnull_36217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}