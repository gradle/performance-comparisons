package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21847 {
    private final Productionnull_21847 production = new Productionnull_21847("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}