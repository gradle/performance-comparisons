package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6084 {
    private final Productionnull_6084 production = new Productionnull_6084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}