package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33980 {
    private final Productionnull_33980 production = new Productionnull_33980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}