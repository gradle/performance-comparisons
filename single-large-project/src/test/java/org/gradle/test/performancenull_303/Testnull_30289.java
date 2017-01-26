package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30289 {
    private final Productionnull_30289 production = new Productionnull_30289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}