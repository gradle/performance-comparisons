package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4402 {
    private final Productionnull_4402 production = new Productionnull_4402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}