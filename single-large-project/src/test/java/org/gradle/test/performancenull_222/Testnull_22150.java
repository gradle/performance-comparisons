package org.gradle.test.performancenull_222;

import static org.junit.Assert.*;

public class Testnull_22150 {
    private final Productionnull_22150 production = new Productionnull_22150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}