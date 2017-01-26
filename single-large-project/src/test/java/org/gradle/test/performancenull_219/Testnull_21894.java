package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21894 {
    private final Productionnull_21894 production = new Productionnull_21894("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}