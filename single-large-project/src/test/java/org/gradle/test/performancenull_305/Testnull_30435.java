package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30435 {
    private final Productionnull_30435 production = new Productionnull_30435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}