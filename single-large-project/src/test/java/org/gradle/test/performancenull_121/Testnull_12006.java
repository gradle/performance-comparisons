package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12006 {
    private final Productionnull_12006 production = new Productionnull_12006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}