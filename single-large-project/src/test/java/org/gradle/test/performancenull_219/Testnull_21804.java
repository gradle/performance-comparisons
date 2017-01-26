package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21804 {
    private final Productionnull_21804 production = new Productionnull_21804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}