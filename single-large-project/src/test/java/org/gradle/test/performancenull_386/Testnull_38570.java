package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38570 {
    private final Productionnull_38570 production = new Productionnull_38570("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}