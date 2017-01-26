package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12002 {
    private final Productionnull_12002 production = new Productionnull_12002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}