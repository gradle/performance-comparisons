package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38519 {
    private final Productionnull_38519 production = new Productionnull_38519("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}