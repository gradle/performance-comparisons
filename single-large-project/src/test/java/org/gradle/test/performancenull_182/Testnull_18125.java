package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18125 {
    private final Productionnull_18125 production = new Productionnull_18125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}