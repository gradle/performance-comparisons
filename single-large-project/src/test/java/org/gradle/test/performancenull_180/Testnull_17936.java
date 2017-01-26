package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17936 {
    private final Productionnull_17936 production = new Productionnull_17936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}