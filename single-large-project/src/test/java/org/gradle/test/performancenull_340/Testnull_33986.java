package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33986 {
    private final Productionnull_33986 production = new Productionnull_33986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}