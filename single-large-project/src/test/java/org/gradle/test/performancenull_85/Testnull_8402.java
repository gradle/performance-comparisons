package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8402 {
    private final Productionnull_8402 production = new Productionnull_8402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}