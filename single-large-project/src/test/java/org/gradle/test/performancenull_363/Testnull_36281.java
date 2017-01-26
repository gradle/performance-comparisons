package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36281 {
    private final Productionnull_36281 production = new Productionnull_36281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}