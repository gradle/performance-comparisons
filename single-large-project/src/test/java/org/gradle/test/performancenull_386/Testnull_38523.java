package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38523 {
    private final Productionnull_38523 production = new Productionnull_38523("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}