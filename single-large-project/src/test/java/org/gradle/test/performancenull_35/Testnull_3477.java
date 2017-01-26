package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3477 {
    private final Productionnull_3477 production = new Productionnull_3477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}