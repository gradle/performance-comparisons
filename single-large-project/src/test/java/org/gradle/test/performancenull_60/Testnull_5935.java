package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5935 {
    private final Productionnull_5935 production = new Productionnull_5935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}