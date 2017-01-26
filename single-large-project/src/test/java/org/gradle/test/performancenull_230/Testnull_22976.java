package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22976 {
    private final Productionnull_22976 production = new Productionnull_22976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}