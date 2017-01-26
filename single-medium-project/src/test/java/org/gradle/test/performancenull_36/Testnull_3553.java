package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3553 {
    private final Productionnull_3553 production = new Productionnull_3553("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}