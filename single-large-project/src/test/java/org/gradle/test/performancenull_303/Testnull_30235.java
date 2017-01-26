package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30235 {
    private final Productionnull_30235 production = new Productionnull_30235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}