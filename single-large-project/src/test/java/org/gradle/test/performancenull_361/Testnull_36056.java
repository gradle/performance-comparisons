package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36056 {
    private final Productionnull_36056 production = new Productionnull_36056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}