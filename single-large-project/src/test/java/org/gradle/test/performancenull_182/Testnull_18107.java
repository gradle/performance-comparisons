package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18107 {
    private final Productionnull_18107 production = new Productionnull_18107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}