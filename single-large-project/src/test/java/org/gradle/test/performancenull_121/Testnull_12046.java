package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12046 {
    private final Productionnull_12046 production = new Productionnull_12046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}