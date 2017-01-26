package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31061 {
    private final Productionnull_31061 production = new Productionnull_31061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}