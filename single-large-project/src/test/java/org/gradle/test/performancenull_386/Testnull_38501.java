package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38501 {
    private final Productionnull_38501 production = new Productionnull_38501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}