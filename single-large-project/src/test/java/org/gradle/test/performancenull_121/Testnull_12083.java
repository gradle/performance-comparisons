package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12083 {
    private final Productionnull_12083 production = new Productionnull_12083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}