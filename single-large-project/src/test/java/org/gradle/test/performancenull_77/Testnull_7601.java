package org.gradle.test.performancenull_77;

import static org.junit.Assert.*;

public class Testnull_7601 {
    private final Productionnull_7601 production = new Productionnull_7601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}