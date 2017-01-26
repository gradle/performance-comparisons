package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17969 {
    private final Productionnull_17969 production = new Productionnull_17969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}