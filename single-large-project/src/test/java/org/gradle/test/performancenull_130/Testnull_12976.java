package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12976 {
    private final Productionnull_12976 production = new Productionnull_12976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}