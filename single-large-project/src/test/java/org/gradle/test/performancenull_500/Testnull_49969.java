package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49969 {
    private final Productionnull_49969 production = new Productionnull_49969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}