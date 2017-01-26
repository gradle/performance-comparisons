package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12066 {
    private final Productionnull_12066 production = new Productionnull_12066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}