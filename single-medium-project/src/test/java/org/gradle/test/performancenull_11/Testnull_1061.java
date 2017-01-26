package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1061 {
    private final Productionnull_1061 production = new Productionnull_1061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}