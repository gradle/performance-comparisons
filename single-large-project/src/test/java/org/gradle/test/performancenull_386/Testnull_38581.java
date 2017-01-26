package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38581 {
    private final Productionnull_38581 production = new Productionnull_38581("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}