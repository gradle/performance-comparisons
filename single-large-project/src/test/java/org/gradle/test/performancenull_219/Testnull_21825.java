package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21825 {
    private final Productionnull_21825 production = new Productionnull_21825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}