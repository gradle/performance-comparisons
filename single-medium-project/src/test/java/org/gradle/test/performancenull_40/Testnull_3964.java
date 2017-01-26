package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3964 {
    private final Productionnull_3964 production = new Productionnull_3964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}