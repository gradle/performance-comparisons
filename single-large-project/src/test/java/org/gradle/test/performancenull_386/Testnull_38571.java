package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38571 {
    private final Productionnull_38571 production = new Productionnull_38571("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}