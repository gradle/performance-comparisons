package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12029 {
    private final Productionnull_12029 production = new Productionnull_12029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}