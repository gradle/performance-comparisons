package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16061 {
    private final Productionnull_16061 production = new Productionnull_16061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}