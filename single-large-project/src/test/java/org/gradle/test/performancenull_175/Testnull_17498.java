package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17498 {
    private final Productionnull_17498 production = new Productionnull_17498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}