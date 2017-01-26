package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21828 {
    private final Productionnull_21828 production = new Productionnull_21828("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}