package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18793 {
    private final Productionnull_18793 production = new Productionnull_18793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}