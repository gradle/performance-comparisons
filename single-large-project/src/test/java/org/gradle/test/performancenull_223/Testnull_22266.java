package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22266 {
    private final Productionnull_22266 production = new Productionnull_22266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}