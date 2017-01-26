package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30496 {
    private final Productionnull_30496 production = new Productionnull_30496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}