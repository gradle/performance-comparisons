package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18986 {
    private final Productionnull_18986 production = new Productionnull_18986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}