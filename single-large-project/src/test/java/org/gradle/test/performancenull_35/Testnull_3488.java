package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3488 {
    private final Productionnull_3488 production = new Productionnull_3488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}