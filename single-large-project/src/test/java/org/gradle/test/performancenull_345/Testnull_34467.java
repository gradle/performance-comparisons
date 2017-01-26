package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34467 {
    private final Productionnull_34467 production = new Productionnull_34467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}