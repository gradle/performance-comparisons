package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14091 {
    private final Productionnull_14091 production = new Productionnull_14091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}