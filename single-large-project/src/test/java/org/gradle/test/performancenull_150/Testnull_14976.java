package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14976 {
    private final Productionnull_14976 production = new Productionnull_14976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}