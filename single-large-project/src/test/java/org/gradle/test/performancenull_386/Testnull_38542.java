package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38542 {
    private final Productionnull_38542 production = new Productionnull_38542("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}