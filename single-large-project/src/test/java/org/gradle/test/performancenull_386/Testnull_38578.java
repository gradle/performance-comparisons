package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38578 {
    private final Productionnull_38578 production = new Productionnull_38578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}