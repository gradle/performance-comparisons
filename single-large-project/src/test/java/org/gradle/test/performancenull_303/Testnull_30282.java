package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30282 {
    private final Productionnull_30282 production = new Productionnull_30282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}