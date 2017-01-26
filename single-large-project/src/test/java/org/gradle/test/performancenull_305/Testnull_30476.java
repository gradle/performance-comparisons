package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30476 {
    private final Productionnull_30476 production = new Productionnull_30476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}