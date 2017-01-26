package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38518 {
    private final Productionnull_38518 production = new Productionnull_38518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}