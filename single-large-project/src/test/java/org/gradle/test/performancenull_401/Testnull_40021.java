package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40021 {
    private final Productionnull_40021 production = new Productionnull_40021("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}