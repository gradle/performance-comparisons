package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21709 {
    private final Productionnull_21709 production = new Productionnull_21709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}