package org.gradle.test.performancenull_437;

import static org.junit.Assert.*;

public class Testnull_43601 {
    private final Productionnull_43601 production = new Productionnull_43601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}