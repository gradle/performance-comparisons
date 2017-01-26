package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36961 {
    private final Productionnull_36961 production = new Productionnull_36961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}