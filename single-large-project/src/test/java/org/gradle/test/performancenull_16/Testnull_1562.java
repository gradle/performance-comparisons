package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1562 {
    private final Productionnull_1562 production = new Productionnull_1562("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}