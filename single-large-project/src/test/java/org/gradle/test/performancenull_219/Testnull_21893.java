package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21893 {
    private final Productionnull_21893 production = new Productionnull_21893("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}