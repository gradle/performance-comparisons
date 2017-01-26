package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18746 {
    private final Productionnull_18746 production = new Productionnull_18746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}