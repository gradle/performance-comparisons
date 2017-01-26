package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26101 {
    private final Productionnull_26101 production = new Productionnull_26101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}