package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1547 {
    private final Productionnull_1547 production = new Productionnull_1547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}