package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18706 {
    private final Productionnull_18706 production = new Productionnull_18706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}