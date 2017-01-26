package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30056 {
    private final Productionnull_30056 production = new Productionnull_30056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}