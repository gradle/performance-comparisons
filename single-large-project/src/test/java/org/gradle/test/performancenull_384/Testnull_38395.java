package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38395 {
    private final Productionnull_38395 production = new Productionnull_38395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}