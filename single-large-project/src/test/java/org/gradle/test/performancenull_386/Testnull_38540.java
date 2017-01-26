package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38540 {
    private final Productionnull_38540 production = new Productionnull_38540("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}