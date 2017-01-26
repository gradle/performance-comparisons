package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22091 {
    private final Productionnull_22091 production = new Productionnull_22091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}