package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40724 {
    private final Productionnull_40724 production = new Productionnull_40724("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}