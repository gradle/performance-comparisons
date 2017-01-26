package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38566 {
    private final Productionnull_38566 production = new Productionnull_38566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}