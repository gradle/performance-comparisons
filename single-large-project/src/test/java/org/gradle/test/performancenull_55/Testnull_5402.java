package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5402 {
    private final Productionnull_5402 production = new Productionnull_5402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}