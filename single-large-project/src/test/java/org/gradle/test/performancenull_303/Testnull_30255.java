package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30255 {
    private final Productionnull_30255 production = new Productionnull_30255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}