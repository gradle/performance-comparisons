package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2745 {
    private final Productionnull_2745 production = new Productionnull_2745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}