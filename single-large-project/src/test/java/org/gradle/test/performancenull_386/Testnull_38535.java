package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38535 {
    private final Productionnull_38535 production = new Productionnull_38535("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}