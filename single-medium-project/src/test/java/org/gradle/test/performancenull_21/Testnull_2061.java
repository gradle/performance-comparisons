package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2061 {
    private final Productionnull_2061 production = new Productionnull_2061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}