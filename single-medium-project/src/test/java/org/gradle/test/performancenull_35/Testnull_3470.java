package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3470 {
    private final Productionnull_3470 production = new Productionnull_3470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}