package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1787 {
    private final Productionnull_1787 production = new Productionnull_1787("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}