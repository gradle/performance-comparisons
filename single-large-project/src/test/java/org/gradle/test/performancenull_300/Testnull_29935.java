package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29935 {
    private final Productionnull_29935 production = new Productionnull_29935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}