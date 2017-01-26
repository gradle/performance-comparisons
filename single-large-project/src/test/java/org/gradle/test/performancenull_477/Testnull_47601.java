package org.gradle.test.performancenull_477;

import static org.junit.Assert.*;

public class Testnull_47601 {
    private final Productionnull_47601 production = new Productionnull_47601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}