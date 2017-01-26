package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5969 {
    private final Productionnull_5969 production = new Productionnull_5969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}