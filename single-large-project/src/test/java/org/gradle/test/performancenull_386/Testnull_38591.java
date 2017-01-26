package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38591 {
    private final Productionnull_38591 production = new Productionnull_38591("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}