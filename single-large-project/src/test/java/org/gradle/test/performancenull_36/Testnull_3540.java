package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3540 {
    private final Productionnull_3540 production = new Productionnull_3540("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}