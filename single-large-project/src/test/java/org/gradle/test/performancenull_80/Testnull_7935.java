package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7935 {
    private final Productionnull_7935 production = new Productionnull_7935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}