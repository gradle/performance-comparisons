package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18620 {
    private final Productionnull_18620 production = new Productionnull_18620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}