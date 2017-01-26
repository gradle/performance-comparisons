package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18121 {
    private final Productionnull_18121 production = new Productionnull_18121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}