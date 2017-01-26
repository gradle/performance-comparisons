package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30226 {
    private final Productionnull_30226 production = new Productionnull_30226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}