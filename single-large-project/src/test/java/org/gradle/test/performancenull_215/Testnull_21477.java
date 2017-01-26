package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21477 {
    private final Productionnull_21477 production = new Productionnull_21477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}