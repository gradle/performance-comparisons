package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28050 {
    private final Productionnull_28050 production = new Productionnull_28050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}