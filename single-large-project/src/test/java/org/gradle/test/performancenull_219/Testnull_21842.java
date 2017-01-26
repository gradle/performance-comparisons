package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21842 {
    private final Productionnull_21842 production = new Productionnull_21842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}