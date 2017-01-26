package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6443 {
    private final Productionnull_6443 production = new Productionnull_6443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}