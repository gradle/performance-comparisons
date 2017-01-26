package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27490 {
    private final Productionnull_27490 production = new Productionnull_27490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}