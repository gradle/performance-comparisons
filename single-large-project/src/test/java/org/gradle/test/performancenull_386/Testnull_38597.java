package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38597 {
    private final Productionnull_38597 production = new Productionnull_38597("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}