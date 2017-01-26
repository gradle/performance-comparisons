package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38533 {
    private final Productionnull_38533 production = new Productionnull_38533("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}