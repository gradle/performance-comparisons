package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25070 {
    private final Productionnull_25070 production = new Productionnull_25070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}