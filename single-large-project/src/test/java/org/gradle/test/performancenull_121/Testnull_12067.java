package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12067 {
    private final Productionnull_12067 production = new Productionnull_12067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}