package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25043 {
    private final Productionnull_25043 production = new Productionnull_25043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}