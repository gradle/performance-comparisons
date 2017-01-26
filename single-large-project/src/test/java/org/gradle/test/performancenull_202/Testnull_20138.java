package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20138 {
    private final Productionnull_20138 production = new Productionnull_20138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}