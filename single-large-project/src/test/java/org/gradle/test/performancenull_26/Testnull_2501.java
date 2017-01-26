package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2501 {
    private final Productionnull_2501 production = new Productionnull_2501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}