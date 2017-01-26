package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16071 {
    private final Productionnull_16071 production = new Productionnull_16071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}