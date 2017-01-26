package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18703 {
    private final Productionnull_18703 production = new Productionnull_18703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}