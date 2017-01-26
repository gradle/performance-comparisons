package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40467 {
    private final Productionnull_40467 production = new Productionnull_40467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}