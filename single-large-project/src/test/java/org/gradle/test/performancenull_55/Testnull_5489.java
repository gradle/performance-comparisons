package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5489 {
    private final Productionnull_5489 production = new Productionnull_5489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}