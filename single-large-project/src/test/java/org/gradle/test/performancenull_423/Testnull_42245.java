package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42245 {
    private final Productionnull_42245 production = new Productionnull_42245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}