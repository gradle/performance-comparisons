package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34988 {
    private final Productionnull_34988 production = new Productionnull_34988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}