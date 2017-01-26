package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38590 {
    private final Productionnull_38590 production = new Productionnull_38590("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}