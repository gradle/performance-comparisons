package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30270 {
    private final Productionnull_30270 production = new Productionnull_30270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}