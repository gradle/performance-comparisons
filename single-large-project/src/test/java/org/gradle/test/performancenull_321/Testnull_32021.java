package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32021 {
    private final Productionnull_32021 production = new Productionnull_32021("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}