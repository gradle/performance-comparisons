package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14935 {
    private final Productionnull_14935 production = new Productionnull_14935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}