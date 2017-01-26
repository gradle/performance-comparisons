package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10050 {
    private final Productionnull_10050 production = new Productionnull_10050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}