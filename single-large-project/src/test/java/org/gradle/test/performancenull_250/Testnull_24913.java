package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24913 {
    private final Productionnull_24913 production = new Productionnull_24913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}