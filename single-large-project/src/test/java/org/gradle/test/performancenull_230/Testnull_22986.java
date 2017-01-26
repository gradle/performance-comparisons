package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22986 {
    private final Productionnull_22986 production = new Productionnull_22986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}