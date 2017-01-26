package org.gradle.test.performancenull_147;

import static org.junit.Assert.*;

public class Testnull_14601 {
    private final Productionnull_14601 production = new Productionnull_14601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}