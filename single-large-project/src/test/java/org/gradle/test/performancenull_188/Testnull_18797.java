package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18797 {
    private final Productionnull_18797 production = new Productionnull_18797("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}