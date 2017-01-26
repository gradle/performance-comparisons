package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18686 {
    private final Productionnull_18686 production = new Productionnull_18686("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}