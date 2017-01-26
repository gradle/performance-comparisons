package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7976 {
    private final Productionnull_7976 production = new Productionnull_7976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}