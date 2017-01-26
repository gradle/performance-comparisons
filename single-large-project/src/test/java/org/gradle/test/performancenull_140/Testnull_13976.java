package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13976 {
    private final Productionnull_13976 production = new Productionnull_13976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}