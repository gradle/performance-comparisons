package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27080 {
    private final Productionnull_27080 production = new Productionnull_27080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}