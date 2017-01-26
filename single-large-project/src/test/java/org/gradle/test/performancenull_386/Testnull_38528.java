package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38528 {
    private final Productionnull_38528 production = new Productionnull_38528("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}