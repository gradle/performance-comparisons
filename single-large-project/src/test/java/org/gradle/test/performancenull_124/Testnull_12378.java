package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12378 {
    private final Productionnull_12378 production = new Productionnull_12378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}