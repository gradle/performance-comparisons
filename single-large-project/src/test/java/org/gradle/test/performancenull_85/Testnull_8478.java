package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8478 {
    private final Productionnull_8478 production = new Productionnull_8478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}