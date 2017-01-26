package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5965 {
    private final Productionnull_5965 production = new Productionnull_5965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}