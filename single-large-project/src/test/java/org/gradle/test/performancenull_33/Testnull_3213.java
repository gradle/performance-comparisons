package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3213 {
    private final Productionnull_3213 production = new Productionnull_3213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}