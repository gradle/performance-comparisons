package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38574 {
    private final Productionnull_38574 production = new Productionnull_38574("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}