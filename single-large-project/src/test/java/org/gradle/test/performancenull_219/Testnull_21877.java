package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21877 {
    private final Productionnull_21877 production = new Productionnull_21877("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}