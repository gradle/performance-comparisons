package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40056 {
    private final Productionnull_40056 production = new Productionnull_40056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}